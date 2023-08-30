package fes.aragon.pila;

import fes.aragon.lista.t.TDAListaSimple;

/**
 * 
 * @author Julio Cesar Morales 
 * 
 * Esta clase sirve para trabajar con la estructura de datos Pila.
 * 
 * Una pila es una lista ordenada o estructura de datos que permite almacenar y recuperar datos, 
 * siendo el modo de acceso a sus elementos de tipo LIFO (del inglés Last In, First Out) que traducido al 
 * español es ultimo en entrar, primero en salir.
 * 
 * En este se utiliza el tipo de dato abstracto en lista simple para crear la pila. 
 * 
 * 
 * @param <T>
 */
public class Pila<T> {

	TDAListaSimple<T> pila = new TDAListaSimple<>();

	/**
	 * Se crea el constructor
	 */
	public Pila() {
	}

	/**
	 * Este método sirve para insertar un dato a la Pila.
	 * 
	 * @param dato Es el dato que se agrega a la Pila.
	 */
	public void insertar(T dato) {
		this.pila.insertarCola(dato);
	}

	/**
	 * Este método sirve para eliminar un dato de la Pila.
	 * 
	 * @return Retorna el dato que se saca.
	 */
	public T sacar() {
		return this.pila.eliminarCola();
	}

	/**
	 * Este método sirve para saber si la Pila está vacía.
	 * 
	 * @return Retorna un boolean para saber si la pila esta vacia o no.
	 */
	public boolean vacia() {
		return this.pila.esVacia();
	}

	/**
	 * Este método sirve para ver el primer elemento de la Pila.
	 * 
	 * @return Retorna el dato.
	 */
	public T verArriba() {
		T dato = this.pila.eliminarCola();
		this.insertar(dato);
		return dato;
	}
	/**
	 * Este metodo muestra todos los elementos de la pila
	 */
	
	public void mostrarPila() {
		this.pila.mostrarDatos();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Pila [pila=" + pila + "]";
	}
	
	

}
