package es.studium.EjemploJoin;
public class Ejemplo06_TiradaDados
{
	private int tiradaDados;
	public Ejemplo06_TiradaDados(int y)
	{
		tiradaDados = y;
	}
	public synchronized int getSumaTirada()
	{
		return tiradaDados;
	}
	public synchronized void setSumaTirada(int y)
	{
		tiradaDados += y;
	}
}