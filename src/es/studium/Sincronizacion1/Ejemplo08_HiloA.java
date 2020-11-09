/**
 * 
 */
package es.studium.Sincronizacion1;

/**
 * @author Alvca
 *
 */
public class Ejemplo08_HiloA extends Thread{
	private Ejemplo08_Contador contador;
	public Ejemplo08_HiloA(String n, Ejemplo08_Contador c)
	{
		setName(n);
		contador = c;
	}
	public void run()
	{
		for (int i = 0; i < 300; i++)
		{
			contador.incrementa();
			try
			{
				sleep(100);
			}
			catch (InterruptedException e) {}
		}
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}
