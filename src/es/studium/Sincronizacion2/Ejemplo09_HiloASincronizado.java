/**
 * 
 */
package es.studium.Sincronizacion2;

/**
 * @author Alvca
 *
 */
public class Ejemplo09_HiloASincronizado extends Thread{
	private Ejemplo09_Contador contador;
	public Ejemplo09_HiloASincronizado(String n, Ejemplo09_Contador c)
	{
		setName(n);
		contador = c;
	}
	public void run()
	{
		synchronized (contador)
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
}
