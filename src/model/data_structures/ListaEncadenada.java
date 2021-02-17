package model.data_structures;

public class ListaEncadenada<T extends Comparable<T>> implements ILista<T>
{
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Primer elemnto de la lista
     */
    private T primero;

    /**
     * Número de elementos en la lista
     */
    private int numElementos;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    public ListaEncadenada( )
    {
    	primero = null;
    	numElementos = 0;
    }
    
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    
	public void addFirst(T element) 
	{		
	
	}

	public void addLast(T element)
	{
		// TODO Auto-generated method stub
		
	}

	public void insertElement(T element, int pos) 
	{
		// TODO Auto-generated method stub
		
	}


	public T removeFirst() 
	{
		// TODO Auto-generated method stub
		return null;
	}


	public T removeLast() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T deleteElement(int pos) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T firstElement()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T lastElement() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T getElement(int pos) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int size() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public int isPresent(T element)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void exchange(int pos1, int pos2) 
	{
		// TODO Auto-generated method stub
		
	}

	public void changeInfo(int pos, T elem) 
	{
		// TODO Auto-generated method stub
		
	}
 
}
