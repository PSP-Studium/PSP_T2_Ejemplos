/**
 * 
 */
package es.studium.ProductorConsumidor2;

/**
 * @author Alvca
 *
 */
public class Ejemplo14_Consumidor implements Runnable {
	private Ejemplo14_Monitor bandeja;
	public Ejemplo14_Consumidor(Ejemplo14_Monitor s)
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
