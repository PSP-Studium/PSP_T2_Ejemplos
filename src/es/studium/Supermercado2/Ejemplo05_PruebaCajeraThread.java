package es.studium.Supermercado2;
public class Ejemplo05_PruebaCajeraThread
{
	public static void main(String[] args)
	{
		Ejemplo05_Cliente cliente1 = new Ejemplo05_Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Ejemplo05_Cliente cliente2 = new Ejemplo05_Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		Ejemplo05_CajeraThread cajera1 = new Ejemplo05_CajeraThread("Cajera 1", cliente1, initialTime);
		Ejemplo05_CajeraThread cajera2 = new Ejemplo05_CajeraThread("Cajera 2", cliente2, initialTime);
		cajera1.start();
		cajera2.start();
	}
}
