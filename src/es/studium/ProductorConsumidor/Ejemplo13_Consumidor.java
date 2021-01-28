/**
 * 
 */
package es.studium.ProductorConsumidor;

/**
 * @author Alvca
 *
 */
public class Ejemplo13_Consumidor implements Runnable {
	private Ejemplo13_Monitor bandeja;
	public Ejemplo13_Consumidor(Ejemplo13_Monitor s)
	{
		bandeja = s;
	}
	public void run()
	{
		int num;
		for(int i=0; i < 5; i++ )
		{
			num = bandeja.coger();
			System.out.println( "Número cogido: "+num);
			try
			{
				Thread.sleep( (int)(Math.random() * 2000));
			}
			catch( InterruptedException e ){}
		}
	}
}
