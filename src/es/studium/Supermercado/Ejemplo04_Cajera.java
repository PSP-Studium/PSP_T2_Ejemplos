package es.studium.Supermercado;
public class Ejemplo04_Cajera
{
	private String nombre;
	// Constructor, getter y setter
	public Ejemplo04_Cajera(String n)
	{
		nombre = n;
	}
	public void procesarCompra(Ejemplo04_Cliente cliente, long timeStamp)
	{
		System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
		for (int i = 0; i < cliente.getCarroCompra().length; i++)
		{
			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
		}
		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() -
					timeStamp) / 1000 + " seg");
	}
	private void esperarXsegundos(int segundos)
	{
		try
		{
			Thread.sleep(segundos * 1000);
		}
		catch (InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
}