package es.studium.Supermercado2;
public class Ejemplo05_Cliente
{
	private String nombre;
	private int[] carroCompra;
	public Ejemplo05_Cliente(String n, int[] c)
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