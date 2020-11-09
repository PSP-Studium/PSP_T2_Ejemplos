/**
 * 
 */
package es.studium.Ejemplos;

/**
 * @author Alvca
 *
 */
public class Ejemplo07_Parametros implements Runnable{
	private int param1;
	private int param2;
	public Ejemplo07_Parametros(int p1, int p2)
	{
	param1 = p1;
	param2 = p2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Ejemplo07_Parametros(4, 5), "Hilo 1").start();
		new Thread(new Ejemplo07_Parametros(7, 9), "Hilo 2").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "\n\tp1 = " + param1 + "\n\tp2 = " + param2);
	}

}
