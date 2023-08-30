package fes.aragon.lista;

import java.util.Iterator;

/**
 * 
 * Esta clase ayuda a crear nuestra lista simple, utilizando nodos.
 * 
 * @author Julio Cesar Morales
 *
 */

public class TDAListaSimple {
	private Nodo cabeza; // Es el primer nodo que se crea
	private Nodo cola; // son los nodos que van en la cola
	private int longitud; // longitud de la lista

	/**
	 * 
	 * 
	 * 
	 */
	public TDAListaSimple() {
		cabeza = cola = null;
	}

	/**
	 * 
	 * Metodo que inserta un nodo de tipo float a la cola
	 * 
	 * @param dato
	 */
	public void insertarCola(float dato) {
		if (cabeza == null) {
			this.cabeza = new Nodo(dato);
			this.cola = cabeza;
		} else {
			Nodo tmp = new Nodo(dato);
			cola.setSiguiente(tmp);
			cola = tmp;
		}
		longitud++;
	}

	/**
	 * 
	 * Es un metodo que verifica si la lista esta vacia o no.
	 * 
	 * @return true o false, dependiendo el caso
	 */
	public boolean esVacia() {
		return cabeza == null;
	}

	/**
	 * Muestra los datos de la lista
	 * 
	 */
	public void mostrarDatos() {
		for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.toString());
		}
	}

	/**
	 * 
	 * Obtiene en la longitud de la lista creada
	 * 
	 * @return Entero
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * 
	 * Metodo que regresa el dato que contiene un nodo.
	 * 
	 * @param indice
	 * 
	 * @return float
	 */
	public float obtenerDato(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		Nodo tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabeza; i != indice; tmp = tmp.getSiguiente(), i++) {
			}

		}
		if (tmp != null) {
			return tmp.getDato();
		} else {
			return -1;
		}
	}

	/**
	 * 
	 * Metodo que ayuda a eliminar el nodo dependiendo del indice que se ingrese
	 * 
	 * 
	 * @param indice
	 * 
	 * @return boolean
	 */
	public boolean eliminarIndice(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		if (!error) {
			if (indice == longitud - 1) {
				eliminarCola();
			} else if (indice == 0) {
				eliminaraCabeza();
			} else {
				int i = 0;
				Nodo tmp = cabeza.getSiguiente();
				Nodo previo = cabeza;

				for (; tmp != null && i != indice - 1; previo = tmp, tmp = tmp.getSiguiente(), i++) {
					// Avanza hasta que encuentra el indice dado
				}
				previo.setSiguiente(tmp.getSiguiente());
				tmp.setSiguiente(null);
				longitud--;
			}
		}
		return error;
	}

	/**
	 * 
	 * Elimina la cabeza de la lista, es decir el primer nodo de la lista.
	 * 
	 */
	public void eliminaraCabeza() {
		if (cabeza == cola) {
			cabeza = null;
			longitud = 0;
		} else {
			Nodo temp = cabeza.getSiguiente();

			cabeza = temp;
			longitud--;
		}
	}

	/**
	 * 
	 * Elimina al ultimo nodo de la lista.
	 * 
	 * 
	 */
	public void eliminarCola() {
		if (this.cabeza == this.cola) {
			this.cabeza = this.cola = null;
		} else {
			Nodo tmp = cabeza.getSiguiente();
			Nodo previo = cabeza;

			for (; tmp.getSiguiente() != null; previo = tmp, tmp = tmp.getSiguiente());
			
			this.cola = previo;
			this.cola.setSiguiente(null);

		}
	}
}
