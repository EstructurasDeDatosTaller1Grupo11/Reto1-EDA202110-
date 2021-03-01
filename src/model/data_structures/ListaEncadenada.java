package model.data_structures;

public class ListaEncadenada<T extends Comparable<T>> implements ILista<T>
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Primer elemnto de la lista
	 */
	private Nodo<T> primero;

	/**
	 * Número de elementos en la lista
	 */
	private int numElementos;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	public ListaEncadenada()
	{
		primero = null;
		numElementos = 0;
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	public void addFirst(T element) 
	{
		Nodo<T> nuevo = new Nodo<T>(element);
		if(primero==null)
		{
			primero = nuevo;
			numElementos ++;
		}
		else
		{
			nuevo.asignarSiguiente(primero);
			primero = nuevo;
			numElementos++;
		}
	}

	public void addLast(T element)
	{
		Nodo<T> nuevo = new Nodo<T>(element);
		if(primero==null)
		{
			primero = nuevo;
			numElementos++;
		}
		else
		{
			Nodo<T> ultimo = primero;
			while(ultimo.darSiguiente()!= null)
			{
				ultimo = ultimo.darSiguiente();
			}
			ultimo.cambiarSiguiente(nuevo);
			numElementos++;
		}

	}

	public void insertElement(T element, int pos) 
	{
		Nodo<T> nuevo = new Nodo<T>(element);
		Nodo<T> actual = primero;
		if(pos<=numElementos)
		{
			int i = 1;
			while(i<=pos);
			{
				actual = actual.darSiguiente();
				i++;
			}
			actual.cambiarSiguiente(nuevo);
		}

	}


	public T removeFirst() 
	{
		T eliminado = null;
		if(primero!=null)
		{
			eliminado = primero.darDatos();
			primero = primero.darSiguiente();
		}
		return eliminado;
	}


	public T removeLast() 
	{
		T eliminado = null;
		if(primero!=null)
		{
			Nodo<T> penultimo = primero;
			while(penultimo.darSiguiente().darSiguiente()!= null)
			{
				penultimo = penultimo.darSiguiente();
			}
			eliminado = penultimo.darSiguiente().darDatos();
			penultimo.asignarSiguiente(null);
		}
		return eliminado;
	}

	public T deleteElement(int pos) 
	{
		Nodo<T> actual = primero;
		T eliminado = null;
		if(pos <= numElementos)
		{
			int i = 1;
			while(i<pos);
			{
				actual = actual.darSiguiente();
				i++;
			}
			eliminado = actual.darSiguiente().darDatos();
			actual.cambiarSiguiente(actual.darSiguiente().darSiguiente());
		}
		return eliminado;
	}

	public T firstElement()
	{
		return primero.darDatos();
	}

	public T lastElement() 
	{		
		Nodo<T> ultimo = primero;
		while(ultimo.darSiguiente()!= null)
		{
			ultimo = ultimo.darSiguiente();
		}
		return ultimo.darDatos();
	}

	public T getElement(int pos) 
	{
		Nodo<T> actual = primero;
		if(pos<=numElementos)
		{
			int i = 1;
			while(i<=pos);
			{
				actual = actual.darSiguiente();
				i++;
			}
			return actual.darDatos();
		}
		else
			return null;
	}

	public int size() 
	{
		return numElementos;
	}

	public boolean isEmpty() 
	{
		return primero == null ?true:false;
	}

	public int isPresent(T element)
	{
		Nodo<T> actual = primero;
		if(actual.darDatos() == element)
		{
			return 1;
		}
		else
		{
			int i = 1;
			while(i <= numElementos)
			{
				if(actual.darDatos()!= element)
				{
					actual = actual.darSiguiente();
					i++;
				}
				else return i;
			}
			return -1;
		}
	}

	public void exchange(int pos1, int pos2) 
	{
		Nodo<T> previo1 = null;
		Nodo<T> posicion1 = null;
		Nodo<T> posterior1= null;
		Nodo<T> previo2 = null;
		Nodo<T> posicion2 = null;
		Nodo<T> posterior2= null;
		Nodo<T> temp1= null;
		Nodo<T> temp2= null;
		Nodo<T> temp3= null;
		if(pos1<=size()&&pos2>=size())
		{
			Nodo<T> actual = primero;

			int i = 1;
			while(i<=size());
			{
				if(i== (pos1-1))
				{
					previo1 = actual;
					posicion1= actual.darSiguiente();
					posterior1=posicion1.darSiguiente();
				}
				if(i== (pos2-1))
				{
					previo2 = actual;
					posicion2=actual.darSiguiente();
					posterior2=posicion1.darSiguiente();
				}
				else
				{
					actual = actual.darSiguiente();
					i++;
				}				
			}
			temp1 = posicion1;
			temp2 = posicion2;
			previo1.asignarSiguiente(temp2);
			previo2.asignarSiguiente(temp1);
			temp3 = posterior1;
			posicion1.asignarSiguiente(posterior2);
			posicion2.cambiarSiguiente(temp3);

		}

	}

	public void changeInfo(int pos, T elem) 
	{
		if(pos<=size())
		{
			Nodo<T> actual = primero;
			int i = 1;
			while(i<=size());
			{
				if(pos == i)
				{
					actual.cambiarDatos(elem);
				}
				else
				{
					actual = actual.darSiguiente();
					i++;
				}
			}
		}
	}

}
