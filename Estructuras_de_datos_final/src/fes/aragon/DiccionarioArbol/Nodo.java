package fes.aragon.DiccionarioArbol;

/**
 * 
 * Clase Nodo que tiene la logica para referenciar los nodos creados en el arbol
 * binario.
 * 
 * @author Julio Cesar Morales
 *
 * @param <T>
 */
public class Nodo<T> {

	private T clave; // Clave es el identificador del alumno
	private Alumno dato; // Dato es la informacion del alumno
	private Nodo<T> hijoIzq;
	private Nodo<T> hijoDer;

	/**
	 * 
	 * Metodo constructor
	 * 
	 * @param clave
	 * @param dato
	 */
	public Nodo(T clave, Alumno dato) {
		super();
		this.clave = clave;
		this.dato = dato;
	}

	/**
	 * Retorna la identificacion del alumno
	 * 
	 * @return
	 */
	public T getClave() {
		return clave;
	}

	/**
	 * Establece la identificacion del alumno 
	 * 
	 */
	public void setClave(T clave) {
		this.clave = clave;
	}

	/**
	 * Obtiene la informacion del alumno
	 * 
	 * @return
	 */
	public Alumno getDato() {
		return dato;
	}

	/**
	 * Establece la informacion
	 * 
	 * @param dato
	 */
	public void setDato(Alumno dato) {
		this.dato = dato;
	}

	/**
	 * Obtiene el Nodo izquierdo
	 * 
	 * @return
	 */
	public Nodo<T> getHijoIzq() {
		return hijoIzq;
	}

	/**
	 *  Establece el nodo izquierdo 
	 *  
	 * @param hijoIzq
	 */
	public void setHijoIzq(Nodo<T> hijoIzq) {
		this.hijoIzq = hijoIzq;
	}

	/**
	 * Obtiene el Nodo derecho
	 * 
	 * @return
	 */
	public Nodo<T> getHijoDer() {
		return hijoDer;
	}

	/**
	 * Establece el Nodo Derecho
	 * 
	 * @param hijoDer
	 */
	public void setHijoDer(Nodo<T> hijoDer) {
		this.hijoDer = hijoDer;
	}

	/**
	 * 
	 * Compara el objeto para ver si es o no igual, menor, o diferente, 
	 * dependiendo el caso retornara true o false. 
	 * 
	 * Un metodo que contiene las comparaciones de tipos datos.
	 * 
	 * 
	 * @param obj
	 * @return
	 */
	public boolean comparaMenor(Object obj) {
		boolean resultado = false;
		if (clave instanceof Integer) {
			Integer dat1 = (Integer) clave;
			Integer dat2 = (Integer) obj;
			resultado = dat1 <= dat2;
		} else if (clave instanceof Float) {
			Float dat1 = (Float) clave;
			Float dat2 = (Float) obj;
			resultado = dat1 <= dat2;
		} else if (clave instanceof Double) {
			Double dat1 = (Double) clave;
			Double dat2 = (Double) obj;
			resultado = dat1 <= dat2;
		}
		return resultado;
	}

}
