/**
 * 
 */
package es.studium.ProductorConsumidor2;

/**
 * @author Alvca
 *
 */
public class Ejemplo14_Principal {
	public static void main(String[] args) throws InterruptedException
	{
		Ejemplo14_Monitor ban = new Ejemplo14_Monitor();
		Ejemplo14_Productor p = new Ejemplo14_Productor(ban);
		Ejemplo14_Consumidor c = new Ejemplo14_Consumidor(ban);
		Thread productor = new Thread(p);
		Thread consumidor = new Thread(c);
		productor.start();
		consumidor.start();
	}
}
