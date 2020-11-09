package es.studium.Supermercado;
public class Ejemplo04_PruebaCajera
{
	public static void main(String[] args)
	{
		Ejemplo04_Cliente cliente1 = new Ejemplo04_Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Ejemplo04_Cliente cliente2 = new Ejemplo04_Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		Ejemplo04_Cajera cajera1 = new Ejemplo04_Cajera("Cajera 1");
		Ejemplo04_Cajera cajera2 = new Ejemplo04_Cajera("Cajera 2");
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}
}
