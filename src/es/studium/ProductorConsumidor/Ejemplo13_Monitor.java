/**
 * 
 */
package es.studium.ProductorConsumidor;

/**
 * @author Alvca
 *
 */
public class Ejemplo13_Monitor {
	private int numero = 0 ;
	Ejemplo13_Monitor()
	{
		numero = 0 ;
	}
	public synchronized int coger()
	{
		return(numero) ;
	}
	public synchronized void dejar(int num)
	{
		numero = num ;
	}

}
