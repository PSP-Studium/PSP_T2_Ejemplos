/**
 * 
 */
package es.studium.Sincronizacion2;

/**
 * @author Alvca
 *
 */
public class Ejemplo09_Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejemplo09_Contador cont = new Ejemplo09_Contador(100);
		Ejemplo09_HiloASincronizado hiloA = new Ejemplo09_HiloASincronizado("Hilo A", cont);
		Ejemplo09_HiloBSincronizado hiloB = new Ejemplo09_HiloBSincronizado("Hilo B", cont);
		hiloA.start();
		hiloB.start();
	}
}
