package es.studium.Ejemplos;

public class Ejemplo03_ThreadEjemploRunnable implements Runnable  {
	public void run()
	{
	for (int i = 0; i < 5; i++)
	{
	System.out.println(i + " " + Thread.currentThread().getName());
	}
	System.out.println("Termina thread " + Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
	// Creamos dos objetos de la clase ThreadEjemploRunnable
		Ejemplo03_ThreadEjemploRunnable objRunnable1 = new Ejemplo03_ThreadEjemploRunnable ();
		Ejemplo03_ThreadEjemploRunnable objRunnable2 = new Ejemplo03_ThreadEjemploRunnable ();
	// Creamos dos Hilos
	// y le pasamos por parámetros los objetos de la clase ThreadEjemploRunnable
	Thread primero = new Thread (objRunnable1);
	Thread segundo = new Thread (objRunnable2);
	// Hemos creado dos hilos primero y segundo, pero no se han ejecutado
	// Para poderlo ejecutar se debe llamar al método start ()
	primero.start();
	segundo.start();
	System.out.println("Termina el hilo principal (Thread main)");
	}
}
