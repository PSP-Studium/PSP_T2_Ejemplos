/**
 * 
 */
package es.studium.Sincronizacion2;

/**
 * @author Alvca
 *
 */
public class Ejemplo09_Contador {
	private int c;
	Ejemplo09_Contador(int c)
	{
		this.c = c;
	}
	public void incrementa()
	{
		c = c + 1;
	}
	public void decrementa()
	{
		c = c - 1;
	}
	public int getValor()
	{
		return c;
	}

}
