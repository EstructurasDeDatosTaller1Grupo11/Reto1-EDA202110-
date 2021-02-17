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
	 * Agrega un elemento en la posición pos si la posición es una
	 * posición válida. Los elementos que estén a partir de la
     * posición dada deben correrse una posición a la derecha. Las
     * posiciones válidas son posiciones donde ya hay un
     * elemento en la lista. La posición del primer elemento es 1,
     * la del segundo es 2 y así sucesivamente.
	 */
	void insertElement(T element, int pos);
	
	/**
	 * Elimina el primer elemento. Se retorna el elemento
     * eliminado
	 */
	T removeFirst( );
	
	/**
	 * Elimina el último elemento. Se retorna el elemento
     * eliminado.
	 */
	T removeLast( );
	
	/**
	 * Elimina el elemento de una posición válida. Se retorna el
     * elemento eliminado.
	 */
	T deleteElement( int pos);
	
	/**
	 * Retorna el primer elemento
	 */
	T firstElement( );
	
	/**
	 * Retorna el último elemento
	 */
	T lastElement( );
	
	/**
	 * Retorna el elemento en una posición válida. La posición del
     * primer elemento es 1, la del segundo es 2 y así
     * sucesivamente
	 */
	T getElement( int pos);
	
	/**
	 * Retorna el número de datos en el arreglo
	 */
	int size( );
	
	/**
	 * Retorna true si el arreglo No tiene datos. false en caso
     * contrario.
	 */
	boolean isEmpty( );
	
	/**
	 * Retorna la posición válida de un elemento. Si no se
     * encuentra el elemento, el valor retornado es -1.
	 */
	int isPresent (T element);
	
	/**
	 * Intercambia la información de los elementos en dos
     * posiciones válidas.
	 */
	void exchange (int pos1, int pos2);
	
	/**
	 * Actualiza el elemento en una posición válida.
	 */
	void changeInfo (int pos, T elem);
	
}
