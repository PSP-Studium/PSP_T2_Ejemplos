/**
 * 
 */
package es.studium.ProductorConsumidor;

/**
 * @author Alvca
 *
 */
public class Ejemplo13_Principal {
	public static void main(String[] args) throws InterruptedException
	{
		Ejemplo13_Monitor ban = new Ejemplo13_Monitor();
		Ejemplo13_Productor p = new Ejemplo13_Productor(ban);
		Ejemplo13_Consumidor c = new Ejemplo13_Consumidor(ban);
		Thread productor = new Thread(p);
		Thread consumidor = new Thread(c);
		productor.start();
		consumidor.start();
	}
}
