package es.studium.Ejemplos;

public class Ejemplo02_ThreadEjemplo extends Thread {
	public Ejemplo02_ThreadEjemplo(String str)
	{
		super(str);
	}
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i + " " + getName());
		}
		System.out.println("Termina thread " + getName());
	}
	public static void main(String[] args)
	{
		new Ejemplo02_ThreadEjemplo("Pepe").start();
		new Ejemplo02_ThreadEjemplo("Juan").start();
		System.out.println("Termina el hilo principal (Thread main)");
	}
}
