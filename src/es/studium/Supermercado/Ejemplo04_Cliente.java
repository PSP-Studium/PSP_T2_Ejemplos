package es.studium.Supermercado;
public class Ejemplo04_Cliente
{
	private String nombre;
	private int[] carroCompra;
	public Ejemplo04_Cliente(String n, int[] c)
	{
		nombre = n;
		carroCompra = c;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public int[] getCarroCompra()
	{
		return carroCompra;
	}
}