package es.studium.ProductorConsumidor;

public class Ejemplo13_Productor implements Runnable {
	private Ejemplo13_Monitor bandeja;
	public Ejemplo13_Productor( Ejemplo13_Monitor s )
	{
		bandeja=s;
	}
	private int numero=0;
	public void run()
	{
		for(int i=0; i < 5; i++ )
		{
			numero= (int)(10*Math.random());
			bandeja.dejar(numero);
			System.out.println( "Producido el número "+numero );
			try
			{
				Thread.sleep( (int)(Math.random() * 1000 ) );
			}
			catch( InterruptedException e ) {}
		}
	}
}
