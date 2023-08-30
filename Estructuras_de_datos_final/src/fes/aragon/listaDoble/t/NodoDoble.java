package fes.aragon.listaDoble.t;

/**
 * Clase de NodoDoble es decir dos puntos de referencia uno siguiente y otro anterior. 
 * 
 * 
 * @author Julio Cesar Morales
 *
 * @param <T>, parametro de cualquier tipo de dato
 */

public class NodoDoble<T> {

	private T dato; // contenido del nodo
	private NodoDoble<T> siguiente; // referencia al siguiente nodo
	private NodoDoble<T> anterior; // referencia al nodo anterior
	
	
	/**
	 * Metodo constructor
	 * @param dato
	 */

	public NodoDoble(T dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}


	
	/**
	 * Retorna el dato del nodo 
	 * 
	 * @return T 
	 */
	public T getDato() {
		return dato;
	}

	/**
	 * 
	 * Establece el dato en el nodo
	 * 
	 * @param dato
	 */
	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Obtiene la referencia al nodo siguiente
	 * 
	 * @return Nodo
	 */

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}
	
	/**
	 * 
	 * Establece la referencia al nodo siguiente
	 * 
	 * @param siguiente
	 */

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	/**
	 * 
	 * Obtiene la refencia al nodo anterior
	 * 
	 * @return
	 */
	public NodoDoble<T> getAnterior() {
		return anterior;
	}
	
	/**
	 * 
	 * Establece la referencia al nodo anterior
	 * @param anterior
	 */

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}
	
	/**
	 * Obtiene el dato
	 */

	public String toString() {
		return this.dato + "";
	}

}
