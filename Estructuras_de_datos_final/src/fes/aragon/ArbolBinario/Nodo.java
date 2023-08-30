package fes.aragon.ArbolBinario;

/**
 * @author Julio Cesar Morales
 * 
 * En clase se declaran todas las variables de forma privada que se utilzaran en 
 * en la clase arbol Binario.
 * 
 * @param <T> Es cualquier dato.
 */

public class Nodo<T>{
	private T dato;
	private Nodo<T> hijoIzq;
	private Nodo <T>hijoDer;
	/** 
	 * se crea el constructor 
	 *
	 * @param dato recibe la informacion. 
	 */
	public Nodo(T dato) {
		super();
		this.dato = dato;
		this.hijoIzq = null;
		this.hijoDer = null;
	}
	/**
	 * El metodo sirve para obtener el dato.
	 * 
	 * @return devuelve el dato.
	 */
	
	public T getDato() {
		return dato;
	}
	/**
	 * El metodo sirve para asignar el dato que se le envia.
	 * 
	 * @param dato Es la informacion 
	 */
	public void setDato(T dato) {
		this.dato = dato;
	}
	/**
	 * El metodo sirve para obtener el nodo hijo izquierdo.
	 * 
	 * @return retorna el hijo izquierdo
	 */
	public Nodo<T> getHijoIzq() {
		return hijoIzq;
	}
	/**
	 * El metodo sirve para asignar el nodo hijo izquierdo() que se le envia.
	 * 
	 * @param hijoIzq recibe el nodo.
	 */
	public void setHijoIzq(Nodo<T> hijoIzq){
		this.hijoIzq = hijoIzq;
		
	/**
	 * El metodo sirve para obtener el nodo hijo derecho.
	 * 
	 * @return retorna el hijo derecho.
	 */
	}
	public Nodo<T> getHijoDer() {
		return hijoDer;
	}
	/** El metodo sirve para asignar el nodo hijo derecho que se le envia.
	 * 
	 * @return hijoDe recibe el nodo.
	 */
	public void setHijoDer(Nodo<T> hijoDer) {
		this.hijoDer = hijoDer;
	}
	/**
	 * Este metodos sirve para hacer una comparacion de datos,solo para Integer, Float, Double.
	 * 
	 * 
	 * @param obj es el tipo de objeto.
	 * 
	 * @return resultado .
	 */
	public boolean comparaMenor(Object obj){
		boolean resultado = false;
		if(dato instanceof Integer){
			Integer dat1 = (Integer)dato;
			Integer dat2  = (Integer)obj;
			resultado = dat1<=dat2;
		}else if(dato instanceof Float){
			Float dat1 = (Float)dato;
			Float dat2  = (Float)obj;
			resultado = dat1<=dat2; 
		}else if(dato instanceof Double){
			Double dat1 = (Double)dato;
			Double dat2  = (Double)obj;
			resultado = dat1<=dat2; 
		}	
		return resultado;
	}

}
