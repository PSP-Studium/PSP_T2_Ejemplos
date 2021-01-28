/**
 * 
 */
package es.studium.HolaAdios;

/**
 * @author Alvca
 *
 */
public class Ejemplo12_HolaAdios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escribeHolaAdios eha = new escribeHolaAdios();
		new E_Adios(eha);
		new E_Hola(eha);
	}

}
class E_Hola implements Runnable
{
	escribeHolaAdios eh;
	E_Hola(escribeHolaAdios eh)
	{
		this.eh = eh;
		new Thread(this, "Hola").start();
	}
	public void run()
	{
		try
		{
			for(int x=0;x<5;x++)
			{
				Thread.sleep(1000);
				eh.eHola();
			}
		}
		catch (InterruptedException e){}
	}
}
class E_Adios implements Runnable
{
	escribeHolaAdios eh;
	E_Adios (escribeHolaAdios eh)
	{
		this.eh = eh;
		new Thread(this, "Adios").start();
	}
	public void run()
	{
		for(int x=0;x<5;x++)
		{
			eh.eAdios();
		}
	}
}
class escribeHolaAdios
{
	boolean haEscritoHola = false;
	public synchronized void eAdios()
	{
		while (haEscritoHola == false)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e) {}
		}
		haEscritoHola = false;
		System.out.print(" Adiós ");
	}
	public synchronized void eHola()
	{
		System.out.print(" Hola ");
		haEscritoHola = true;
		notify();
	}
}
