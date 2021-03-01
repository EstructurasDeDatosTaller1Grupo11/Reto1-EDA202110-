package model.data_structures;

public class Nodo<T extends Comparable<T> >
{

	private T datos;
	
	private Nodo<T> siguiente;
	
	public Nodo(T pDatos)
	{
		datos = pDatos;
		siguiente = null;
	}
	
	public T darDatos()
	{
		return this.datos;
	}
	
	public void cambiarDatos(T pDatos)
	{
		datos = pDatos;
	}
	
	public Nodo<T> darSiguiente()
	{
		return this.siguiente;
	}
	
	public void asignarSiguiente(Nodo<T> pSiguiente)
	{		
		siguiente = pSiguiente;
	}
	
	public void cambiarSiguiente(Nodo<T> pSiguiente)
	{
		Nodo<T> posterior = this.darSiguiente().darSiguiente();
		pSiguiente.asignarSiguiente(posterior);
		siguiente = pSiguiente;
	}
	public void eliminarSiguiente()
	{
		Nodo<T> posterior = this.darSiguiente().darSiguiente();
		siguiente = posterior;
	}
	
}
