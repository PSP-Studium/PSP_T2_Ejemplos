/**
 * 
 */
package es.studium.Sincronizacion1;

/**
 * @author Alvca
 *
 */
public class Ejemplo08_Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejemplo08_Contador cont = new Ejemplo08_Contador(100);
		Ejemplo08_HiloA hiloA = new Ejemplo08_HiloA("Hilo A", cont);
		Ejemplo08_HiloB hiloB = new Ejemplo08_HiloB("Hilo B", cont);
		hiloA.start();
		hiloB.start();
	}
}
