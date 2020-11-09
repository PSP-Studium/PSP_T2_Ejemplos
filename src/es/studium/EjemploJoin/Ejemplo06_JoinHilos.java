package es.studium.EjemploJoin;
public class Ejemplo06_JoinHilos implements Runnable
{
	private Ejemplo06_TiradaDados xobj;
	public Ejemplo06_JoinHilos(Ejemplo06_TiradaDados m)
	{
		xobj = m;
	}
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			int resultadoDado = (int) (Math.random() * 6) + 1;
			xobj.setSumaTirada(resultadoDado);
			System.out.println("Tirada del hilo " + Thread.currentThread().getName()
					+ ":" + resultadoDado);
		}
		catch (InterruptedException e) {}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Ejemplo06_TiradaDados tirada = new Ejemplo06_TiradaDados(0);
		Ejemplo06_JoinHilos obj1 = new Ejemplo06_JoinHilos(tirada);
		Ejemplo06_JoinHilos obj2 = new Ejemplo06_JoinHilos(tirada);
		Ejemplo06_JoinHilos obj3 = new Ejemplo06_JoinHilos(tirada);
		Thread hilo_1 = new Thread(obj1);
		hilo_1.setName("Dado 1");
		Thread hilo_2 = new Thread(obj2);
		hilo_2.setName("Dado 2");
		Thread hilo_3 = new Thread(obj3);
		hilo_3.setName("Dado 3");
		hilo_1.start();
		hilo_2.start();
		hilo_3.start();
		hilo_1.join(); // Espera el hilo_1 que el hilo principal, que lo ha invocado, termine
		hilo_2.join();
		hilo_3.join();
		System.out.println("Total tirada: " + tirada.getSumaTirada());
		System.out.println("Final del Hilo Principal");
	}
}
