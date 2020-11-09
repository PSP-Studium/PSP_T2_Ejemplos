/**
 * 
 */
package es.studium.Sincronizacion1;

/**
 * @author Alvca
 *
 */
public class Ejemplo08_Contador {
	private int c;
	Ejemplo08_Contador(int c)
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
