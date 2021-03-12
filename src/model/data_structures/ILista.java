package model.data_structures;

import java.util.ArrayList;

public interface ILista <T extends Comparable<T>> 
{
	/**
	 * Agrega un elemento al inicio de la lista
	 */
	void addFirst(T element);
	
	/**
	 * Agrega un elemento al final de la lista
	 */
	void addLast(T element);
	
	/**
	 * Agrega un elemento en la posici�n pos si la posici�n es una
	 * posici�n v�lida. Los elementos que est�n a partir de la
     * posici�n dada deben correrse una posici�n a la derecha. Las
     * posiciones v�lidas son posiciones donde ya hay un
     * elemento en la lista. La posici�n del primer elemento es 1,
     * la del segundo es 2 y as� sucesivamente.
	 */
	void insertElement(T element, int pos);
	
	/**
	 * Elimina el primer elemento. Se retorna el elemento
     * eliminado
	 */
	T removeFirst( );
	
	/**
	 * Elimina el �ltimo elemento. Se retorna el elemento
     * eliminado.
	 */
	T removeLast( );
	
	/**
	 * Elimina el elemento de una posici�n v�lida. Se retorna el
     * elemento eliminado.
	 */
	T deleteElement( int pos);
	
	/**
	 * Retorna el primer elemento
	 */
	T firstElement( );
	
	/**
	 * Retorna el �ltimo elemento
	 */
	T lastElement( );
	
	/**
	 * Retorna el elemento en una posici�n v�lida. La posici�n del
     * primer elemento es 1, la del segundo es 2 y as�
     * sucesivamente
	 */
	T getElement( int pos);
	
	/**
	 * Retorna el n�mero de datos en el arreglo
	 */
	int size( );
	
	/**
	 * Retorna true si el arreglo No tiene datos. false en caso
     * contrario.
	 */
	boolean isEmpty( );
	
	/**
	 * Retorna la posici�n v�lida de un elemento. Si no se
     * encuentra el elemento, el valor retornado es -1.
	 */
	int isPresent (T element);
	
	/**
	 * Intercambia la informaci�n de los elementos en dos
     * posiciones v�lidas.
	 */
	void exchange (int pos1, int pos2);
	
	/**
	 * Actualiza el elemento en una posici�n v�lida.
	 */
	void changeInfo (int pos, T elem);
	
    public ILista sublista(int numElementos);

}
