package fes.aragon.cola;

import fes.aragon.lista.t.TDAListaSimple;

/**
 * 
 *  Cola tambien llamado fila es una estructura de datos de tipo de dato abstracto que se caracteriza por una
 *  secuencia de elementos en la que la operaci�n de inserci�n push se realiza por un extremo y
 *  la operaci�n de extracci�n pull por el otro. Tambi�n se le llama estructura FIFO (del ingl�s First In First Out), 
 *  debido a que el primer elemento en entrar ser� tambi�n el primero en salir.
 * 
 * 
 * @author Julio Cesar Morales  
 * 
 * 			  Esta clase sirve para trabajar con la estructura de datos Cola.
 * 
 * @param <T> Sirve para crear una Cola de tipo gen�rica, es decir, que el
 *            usuario pueda ingresar el tipo de dato que el requiera.
 *                      
 */
public class Cola<T> {

	/**
	 * Se crea un objeto de lista simple ya que es muy similar a una cola, con la finalidad de
	 * aprovechar los metodos construidos en la clase TDAListaSimple. 
	 */
	
	TDAListaSimple<T> cola = new TDAListaSimple<>(); 

	/**
	 * Constructor
	 */
	public Cola() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este m�todo sirve para borrar completamente la cola
	 */
	public void borrar() {
		cola = new TDAListaSimple<>();
	}

	/**
	 * Este m�todo sirve para agregar un elemento a la Cola.
	 * 
	 * @param dato Este dato es el que se va a agregar a la cola.
	 */
	public void insertar(T dato) {
		this.cola.insertarCola(dato);
	}

	/**
	 * Este metodo sirve para agreagrar un elemento en cabeza.
	 * 
	 * @param dato Este dato es el que se va a agregar a la cola.
	 */
	public void prioridad(T dato) {
		this.cola.insertarCabeza(dato);
	}

	/**
	 * Este m�todo sirve para sacar el elemento de la Cola. Cumpliendo con el
	 * principio b�sico de esta, que es que el primer elemento que entra es el
	 * primero en salir.
	 * 
	 * @return Retorna el dato que saca.
	 */
	public T sacar() {
		return this.cola.eliminarCola();
	}

	/**
	 * Este m�todo sirve para conocer si la lista est� vac�a, es decir, no contiene
	 * ning�n dato.
	 * 
	 * @return Retorna un boolean, para saber si hizo el procedimiento de manera
	 *         correcta.
	 */
	public boolean vacia() {
		return this.cola.esVacia();
	}

	/**
	 * Este m�todo sirve para ver el primer elemento
	 * 
	 * @return Retorna el dato insertado.
	 */
	public T verArriba() {
		T dato = this.cola.eliminarCabeza();
		this.insertar(dato);
		return dato;
	}

	/**
	 * Este metodo sirve para mostrar todos los dato que hay en la clase.
	 * 
	 * @return
	 */
	public T verCola() {
		cola.mostrarDatos();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cola [cola=" + cola + "]";
	}
}