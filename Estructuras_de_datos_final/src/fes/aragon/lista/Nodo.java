package fes.aragon.lista;

/**
 * 
 * @author Julio Cesar Morales
 * 
 *  Clase que sirve para crear un nodo, con el tipo de dato float.
 * 
 *
 */

public class Nodo {
	
	private float dato; // dato o valor que contiene el nodo
	private Nodo siguiente; // ayuda con la referencia o apuntar al nodo siguiente. 
	
	/**
	 * 
	 * Metodo constructor
	 * 
	 * @param dato 
	 */

	public Nodo(float dato) {
		// TODO Auto-generated constructor stub
		super();
		this.dato = dato;
		this.siguiente = null;
	}
	
	/**
	 * 
	 * Obtiene el nodo siguiente
	 * 
	 * @return Nodo siguiente 
	 */

	public Nodo getSiguiente() {
		return siguiente;
	}
	/**
	 * 
	 * Establece el nodo siguiente, es decir hace la referencia al nodo siguiente para formar una lista simple.
	 * 
	 * @param siguiente
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	/**
	 * Obtiene el dato del nodo
	 *  
	 * @return dato
	 */
	public float getDato() {
		return dato;
	}
	/**
	 * 
	 * Establece el dato del nodo
	 * 
	 * @param dato
	 */
	public void setDato(float dato) {
		this.dato = dato;
	}
	
	/**
	 * 
	 * Retorna el dato 
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.dato+"";
	
	
    }
}
