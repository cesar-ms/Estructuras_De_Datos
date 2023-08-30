package fes.aragon.listaDoble.t;

import javax.xml.transform.Templates;

import fes.aragon.listaDoble.t.NodoDoble;

/**
 * 
 * En esta clase se encuentra la logia de las listas dobles que básicamente son
 * similares a las listas simples, con la diferencia que este tipo de estructura
 * vamos a poder insertar los nodos haciendo referencia hacia un nodo anterior y
 * otro siguiente.
 * 
 * @author Julio Cesa Morales
 *
 * @param <T>
 */

public class TDAListaDoble<T> {
	private NodoDoble<T> cabeza;
	private NodoDoble<T> cola;
	private int longitud;

	/**
	 * Metodo constructor
	 */
	public TDAListaDoble() {
		// TODO Auto-generated constructor stub
		cabeza = cola = null;
	}

	/**
	 * Inserta la cabeza de la lista doble
	 * 
	 * @param dato
	 */
	public void insertarCabeza(T dato) {
		if (cabeza == null) {
			this.cabeza = new NodoDoble<T>(dato);
			this.cola = cabeza;
		} else {
			NodoDoble<T> tmp = new NodoDoble<T>(dato);
			tmp.setSiguiente(cabeza);
			cabeza.setAnterior(tmp);
			cabeza = tmp;
		}
		longitud++;
	}

	/**
	 * Inserta los elementos que van a formar parte de la lista
	 * 
	 * @param dato
	 */

	public void insertarCola(T dato) {
		if (cabeza == null) {
			this.cabeza = new NodoDoble<T>(dato);// se crea un nodo y va a cabeza
			this.cola = cabeza;
		} else {
			NodoDoble<T> tmp = new NodoDoble<T>(dato);
			cola.setSiguiente(tmp);
			tmp.setAnterior(cola);
			cola = tmp;// automaticamnete nodo se cambia a nueva cola tmp
		}
		longitud++;
	}

	/**
	 * Obtiene la longitud
	 * 
	 * @return
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * Verifica si la lista esta vacia o no
	 * 
	 * @return boolean
	 */
	public boolean esVacia() {
		return cabeza == null;
	}

	/**
	 * Imprime o muestra la lista del primer elemento al ultimo elemento de la lista
	 */

	public void mostrarDatosCabezaACola() {
		for (NodoDoble<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.toString());
		}
	}

	/**
	 * Imprime la lista del ultimo elemto al primer elemento de la lista
	 */
	public void mostrarDatosColaAcabeza() {
		for (NodoDoble<T> tmp = cola; tmp != null; tmp = tmp.getAnterior()) {
			System.out.println(tmp.toString());
		}
	}

	/**
	 * Obtiene el dato dependiendo del indice que se ingrese
	 * 
	 * @param indice
	 * @return
	 */
	public T obtenerDato(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		NodoDoble<T> tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabeza; i != indice; tmp = tmp.getSiguiente(), i++)
				;
		}
		if (tmp != null) {
			return tmp.getDato();
		} else {
			return null;
		}
	}

	/**
	 * Elimina nodo dependiendo del indice que se ingrese
	 * 
	 * @param indice
	 */
	public void eliminarIndice(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		if (!error) {
			if (indice == longitud - 1) {
				eliminarCola();
			} else if (indice == 0) {
				eliminarCabeza();
			} else {
				int i = 0;
				NodoDoble<T> tmp = cabeza.getSiguiente();
				NodoDoble<T> previo = cabeza;
				for (; tmp != null && i != indice - 1; previo = tmp, tmp = tmp.getSiguiente(), i++)
					;
				previo.setSiguiente(tmp.getSiguiente());
				tmp.setSiguiente(null);
				longitud--;
			}
		}
	}

	/**
	 * Elimina el nodo que encabeza la lista
	 * 
	 * @return
	 */

	public T eliminarCabeza() {
		NodoDoble<T> primero = null;
		if (this.cabeza == this.cola) {
			primero = cabeza;
			this.cabeza = this.cola = null;

		} else {
			//
			NodoDoble<T> tmp = cabeza.getSiguiente();
			tmp.setAnterior(null);
			cabeza.setSiguiente(null);
			cabeza = tmp;
			primero = tmp;
			longitud--;
		}
		return primero.getDato();
	}
	/**
	 * Elimina el ultimo nodo de la lista
	 * 
	 * @return
	 */
	public T eliminarCola() {
		NodoDoble<T> dato = null;
		if (this.cabeza == this.cola) {
			this.cabeza = this.cola = null;
		} else {
			NodoDoble<T> tmp = cola.getAnterior();
			tmp.setSiguiente(null);
			cola.setAnterior(null);
			cola = tmp;
			dato = tmp;
		}
		longitud--;
		return dato.getDato();
	}
	
	/**
	 * Elimina el nodo dependiendo del dato que se ingrese
	 * 
	 * @param dato
	 * @return boolean
	 */
	public boolean eliminarDato(T dato) {
		boolean borrar = false;
		if (this.cabeza != null) {
			if ((this.cabeza == this.cola) && (dato.equals(this.cabeza.getDato()))) {
				this.cabeza = this.cola = null;
				longitud--;

				borrar = true;
			} else if ((dato.equals(this.cabeza.getDato()))) {
				this.cabeza = cabeza.getSiguiente();
				longitud--;
				borrar = true;
			} else {
				NodoDoble<T> tmp = cabeza.getSiguiente();
				NodoDoble<T> previo = cabeza;
				NodoDoble<T> adelante = tmp.getSiguiente();

				for (; tmp != null && !(tmp.getDato().equals(dato));
						// previo = previo.getSiguiente(), tmp = tmp.getSiguiente());
						tmp = tmp.getSiguiente())
					;
				if (tmp != null) {
					previo = tmp.getAnterior();

					if (tmp == this.cola) {
						this.cola.setAnterior(null);
						this.cola = previo;
						cola.setSiguiente(null);
					} else {
						adelante = tmp.getSiguiente();
						previo.setSiguiente(adelante);
						adelante.setAnterior(previo);
						tmp.setSiguiente(null);
						tmp.setAnterior(null);
					}
					longitud--;
					borrar = true;
				}
			}

		}
		return dato.equals(dato);
	}
	

	/**
	 * Obtiene el promedio
	 */
	public void promedio() {
		float suma = 0;
		for (NodoDoble<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			suma += Float.parseFloat(tmp.toString());
		}

		System.out.println("\nEl PEOMEDIO ES: " + suma / longitud);
	}
	/**
	 * Obtiene la calificacion mayor.
	 * 
	 * @return
	 */
	public float calificacionMayor() {
		float temporal = Float.parseFloat(cabeza.toString());
		float temporal2 = 0;
		for (NodoDoble<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			if (tmp.getSiguiente() != null) {
				temporal2 = Float.parseFloat(tmp.getSiguiente().toString());
				if (temporal < temporal2) {
					temporal = temporal2;
				}
			}
		}
		return temporal;
	}
	/**
	 * Obtiene la calificacion menor
	 * 
	 * @return
	 */
	public float calificacionMenor() {
		float temporal = Float.parseFloat(cabeza.toString());
		float temporal2 = 0;

		for (NodoDoble<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			if (tmp.getSiguiente() != null) {
				temporal2 = Float.parseFloat(tmp.getSiguiente().toString());
				if (temporal > temporal2) {
					temporal = temporal2;
				}

			}

		}
		return temporal;
	}

	/**
	 * Obtiene el rango de calificaciones
	 * 
	 */
	public void Rango() {
		float calMayor = calificacionMayor();
		float calMenor = calificacionMenor();
		float rango = calMayor - calMenor;
		System.out.println("\nEl RANGO ES: " + rango);

	}
	/**
	 * Obtiene la moda
	 */
	public void Moda() {
		float moda = 0;
		float temporal2;
		float temporal1;
		int maxVecesRepetido = 0;

		for (NodoDoble<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			int vecesRepetido = 0;
			temporal1 = Float.parseFloat(tmp.toString());
			for (NodoDoble<T> tmp2 = cabeza; tmp2 != null; tmp2 = tmp2.getSiguiente()) {
				temporal2 = Float.parseFloat(tmp2.toString());
				if (temporal1 == temporal2) {
					vecesRepetido++;
				}
				if (vecesRepetido >= maxVecesRepetido) {
					moda = temporal1;
					maxVecesRepetido = vecesRepetido;
				}
			}
		}
		System.out.println("\nLA MODA ES " + moda + " Y SE REPITE " + maxVecesRepetido + " VECES");
	}

}
