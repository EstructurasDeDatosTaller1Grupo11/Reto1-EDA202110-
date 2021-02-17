package model.data_structures;

import java.util.Collection;

import javax.lang.model.util.ElementScanner6;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T extends Comparable<T>> implements ArregloDinamico<T> 
{
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[])new Object[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T [ ] copia = elementos;
                    elementos = (T[]) new Object[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() 
		{
			return tamanoMax;
		}

		public int darTamano() 
		{
			return tamanoAct;
		}

		public T darElemento(int i) 
		{
			return elementos[i];
		}
		
		public T[] darElementos()
		{
			return elementos;
		}

		public T buscar(T dato)
		{
			T solucion = null;
      int i = 0;
      boolean encontro = false;
      while (i < tamanoAct && !encontro)
      {
        if(elementos[i].compareTo(dato) == 0)
			  {
          encontro = true;
          solucion = elementos[i];
			  }
        i++;
      }
			return solucion;
		}

		public void eliminar(T dato) 
		{
			for(int i = 0; i < tamanoAct; i++)
			{
				if(elementos[i].compareTo(dato) == 0)
				{
					if(i == tamanoAct)
					{
						tamanoAct --;
					}
					else
					{
						for(int j = i + 1; j < tamanoAct; j++)
						{
							elementos[i] = elementos[j];							
						}
						tamanoAct--;
					}
				}
			}
		}
    
    public void invertir( )
    {
      T temporal[] = (T[]) new Object[tamanoMax];
      int j = 0;
      for(int i = tamanoAct; i >= 0; i--)
      {
        temporal[j] = elementos[i];
        j++;
      }
      elementos = temporal;
    }
}
