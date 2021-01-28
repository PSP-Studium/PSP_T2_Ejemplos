/**
 * 
 */
package es.studium.Ejemplos;

/**
 * @author Alvca
 *
 */
public class Ejemplo16_PrioridadesHilos implements Runnable{
	String strImprimir;
	public Ejemplo16_PrioridadesHilos(String strP)
	{
	strImprimir=strP;
	}
	public void run()
	{
	for(int x=0;x<10;x++)
	{
	System.out.println(strImprimir);
	}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo16_PrioridadesHilos objRunnable1 = new Ejemplo16_PrioridadesHilos("Corredor 1");
		Ejemplo16_PrioridadesHilos objRunnable2 = new Ejemplo16_PrioridadesHilos("Corredor 2");
		//Creamos el hilo con el objeto Runnable
		Thread primero = new Thread(objRunnable1);
		//Asignamos un nombre al primer hilo
		primero.setName("Corredor 1");
		Thread segundo = new Thread(objRunnable2);
		//Asignamos un nombre al segundo hilo
		segundo.setName("Corredor 2");
		//Cambiamos la prioridad de hilo primero y le ponemos las más baja
		primero.setPriority(Thread.MIN_PRIORITY);
		//Mostramos el nombre del hilo y su prioridad
		System.out.println("Prioridad del " + primero.getName()+ ": " + primero.getPriority());
		//Cambiamos la prioridad de hilo segundo y le ponemos las más altas
		segundo.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Prioridad del " + segundo.getName()+ ": " + segundo.getPriority());
		// Llamamos al método start () para que empiece poniendolos a preparados
		primero.start();
		segundo.start();
		System.out.println("Final del Hilo Principal");
	}

}
