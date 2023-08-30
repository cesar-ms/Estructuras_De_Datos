package fes.aragon.ArbolBinario;

import fes.aragon.cola.Cola;
import fes.aragon.pila.Pila;

/**
 * 
 * @author Julio Cesar Morales
 * 
 *         En esta clase ArbolBinario<T>, se implementan la solucion a los
 *         problemas que tiene la construccion de un arbol binario asi como los
 *         recorridos, el minimo, maximo, la altura, la profundidad,
 *         eliminacion, insercion, niveles del arbol y la evaluacion de una
 *         exprecion prefija. Para ello la contruccion general del arbol binario
 *         en esta clase sera de tipo de dato T, que seria cualquier tipo de
 *         dato pero al momento de hacer el arbol sera de solo el mismo tipo
 *         (integer,String, float, etc.).
 *
 * @param <T> es cualquier tipo de dato.
 * 
 */
public class ArbolBinario<T> {

	private Nodo<T> raiz;// se crea una variable nodo que es raiz.

	/**
	 * Metodo constructor.
	 * 
	 */
	public ArbolBinario() {
		super();
		this.raiz = null;
	}

	/**
	 * Obtiene la raiz del arbol.
	 * 
	 * @return regresa la raiz.
	 */
	public Nodo<T> getRaiz() {
		return raiz;
	}

	/**
	 * Se agrega la raiz.
	 * 
	 * @param raiz, recibe la raiz nueva.
	 */
	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}

	/**
	 * En este metodo insertar se agregan los nodos(con el tipo de dato)para la
	 * contruccion del arbol binario.
	 * 
	 * @param dato, es el elemento que contiene el nodo
	 */
	public void insertar(T dato) {
		Nodo n = raiz, previo = null;
		while (n != null) {
			previo = n;
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		if (raiz == null) {
			raiz = new Nodo(dato);
		} else {
			if (previo.comparaMenor(dato)) {
				previo.setHijoDer(new Nodo(dato));
			} else {
				previo.setHijoIzq(new Nodo(dato));
			}
		}
	}

	/**
	 * En este metodo recorre el arbol por amplitud donde que recorre primero la
	 * raíz, luego se recorren los demas nodos ordenados por el nivel al que
	 * pertenecen en orden de Izquierda a derecha.
	 *
	 */
	public void recorrerAmplitud() {
		Nodo n = raiz;
		Cola<Nodo> cola = new Cola<>();
		if (n != null) {
			cola.insertar(raiz);
			while (!cola.vacia()) {
				n = cola.sacar();
				System.out.println(n.getDato());
				if (n.getHijoIzq() != null) {
					cola.insertar(n.getHijoIzq());
				}
				if (n.getHijoDer() != null) {
					cola.insertar(n.getHijoDer());
				}
			}
		}
	}

	/**
	 * El metodo eliminar, hace una busqueda de la informacion que se desea eliminar, una vez encontrada
	 * realiza la eliminacion haciendo un guardado de los nodos previos para salvar la informacion 
	 * de los nodos hijos si es que los tiene.
	 * 
	 * @param dato recibe el dato para la eliminacion.
	 */

	public void eliminar(T dato) {
		Nodo<T> tmp, nodo, previo = null, n = raiz;
		while (n != null && n.getDato() != dato) {
			previo = n;
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		nodo = n;
		if (n != null && n.getDato() == dato) {
			if (nodo.getHijoDer() == null) {
				nodo = nodo.getHijoIzq();
			} else if (nodo.getHijoIzq() == null) {
				nodo = nodo.getHijoDer();
			} else {
				tmp = nodo.getHijoIzq();
				while (tmp.getHijoDer() != null) {
					tmp = tmp.getHijoDer();
				}
				tmp.setHijoDer(nodo.getHijoDer());
				nodo = nodo.getHijoIzq();
			}
			if (n == raiz) { // si se encontro la informacion
				raiz = nodo;
			} else if (previo.getHijoIzq() == n) {
				previo.setHijoIzq(nodo);
			} else {
				previo.setHijoDer(nodo);
			}
		} else if (raiz != null) {
			System.out.println("no existe");
		} else {
			System.out.println("Arbol vacio");
		}
	}

	/**
	 * El metodo minimo, funciona como una busqueda sobre el numero menor que
	 * contiene el arbol binario e imprime el valor cuando lo encuentra.
	 */
	public void minimo() {
		Nodo<T> n = raiz, previo = null;
		if (n != null) {
			previo = n;
			while (n.getHijoIzq() != null) {
				previo = n.getHijoIzq();
				n = n.getHijoIzq();
			}
			System.out.println("el numero minimo es " + previo.getDato());
		} else {
			System.out.println("no hay arbol");
		}
	}

	/**
	 * El metodo maximo, funciona como una busqueda sobre el numero mayor que
	 * contiene el arbol binario e imprime el valor cuando lo encuentra.
	 */
	public void maximo() {
		Nodo<T> n = raiz, previo = null;
		if (n != null) {
			previo = n;
			while (n.getHijoDer() != null) {
				previo = n.getHijoDer();
				n = n.getHijoDer();
			}
			System.out.println("el numero maximo es " + previo.getDato());
		} else {
			System.out.println("no hay arbol");
		}
	}

	/**
	 * El recorrido por preorden que utiliza la recusrividad donde se inicia en la
	 * Raíz y luego se recorre en pre-orden cada unode los sub-árboles de izquierda
	 * a derecha.
	 * 
	 * @param n recibe un nodo (raiz).
	 */
	public void preorden(Nodo n) {
		if (n != null) {
			System.out.println(n.getDato());
			preorden(n.getHijoIzq());
			preorden(n.getHijoDer());
		}
	}

	/**
	 * El metodo implementa la recursividad donde recorre en in-orden el primer
	 * sub-árbol, luego se recorre la raíz y al final se recorre en in-orden los
	 * demas sub-árboles.
	 * 
	 * @param n recibe un nodo (raiz).
	 */
	public void inorden(Nodo n) {
		if (n != null) {
			inorden(n.getHijoIzq());
			System.out.println(n.getDato());
			inorden(n.getHijoDer());
		}
	}

	/**
	 * El metodo hace la recusividad del metodo donde se recorre el pos-orden cada
	 * uno de los sub-árboles y al final se recorre la raíz.
	 * 
	 * @param n recibe un nodo (raiz)..
	 */
	public void postOrden(Nodo n) {
		if (n != null) {
			postOrden(n.getHijoIzq());
			postOrden(n.getHijoDer());
			System.out.println(n.getDato());
		}
	}

	/**
	 * Este metodo Altura, se bsasa en que la altura de un nodo en un árbol es el
	 * número de nodos del camino más largo de ese nodo a una hoja.
	 *
	 * @param n recibe el nodo que se desea encotrar la altura.
	 * 
	 * @return regresa la altura del nodo.
	 */
	public int Altura(Nodo n) {
		int h, max;
		if (n == null) {
			return -1;
		} else {
			h = Altura(n.getHijoDer());
			max = Altura(n.getHijoIzq());
		}
		if (h > max) {
			max = h;
		}
		return (max + 1);
	}

	/**
	 * El metodo profundidad, se basa que la profundidad de un nodo es la longitud
	 * del camino único que va desde la raiz hasta ese nodo.
	 * 
	 * @param dato reibe el dato que se quire encontrar la profundidad.
	 * 
	 * @return regresa la profudidad.
	 */
	public int profundidad(T dato) {
		Nodo<T> n = raiz;
		int contador = 0;
		while (n != null && n.getDato() != dato) {// si el dato de la raiz es diferente del dato que me das
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
			contador++;
		}
		return contador;
	}

	/**
	 * Este metodo, funciona con recursividad, buscando el nodo que contiene la
	 * informacion que le enviamos por el parametro valor, utilizando un recorrido
	 * en los sub-arboles.
	 * 
	 * @param n     recibe un nodo (raiz).
	 * @param valor es la informacion que es la via para encontrar el nodo que se
	 *              busca ( en este caso enteros).
	 * 
	 * @return retorna el nodo.
	 */
	public Nodo BuscarNodo(Nodo n, int valor) {
		if (n == null) {
			return (null); // árbol vacío o hijo de hoja
		} else {
			if (n.getDato().equals(valor)) {
				return (n); // lo encontró
			} else {
				if (n.comparaMenor(valor)) {
					n = BuscarNodo(n.getHijoDer(), valor);
				} else {
					n = BuscarNodo(n.getHijoIzq(), valor);
				}
			}
			return (n); // los retornos de las llamadas recursivas se pasan via t
		}
	}

	String[] niveles; // se crea un arreglo

	/**
	 * Este metodo tiene la funcion para encontrar los niveles del arbol binario y
	 * mostrar los nodos que se encuntran en cada nivel.
	 * 
	 * @param nivel recibe el numero de nivel,
	 */
	public void imprimirNivel(int nivel) {
		nivel--;
		niveles = new String[Altura(getRaiz()) + 1]; // crea un arreglo de el numero de altura

		imprimirNivel(raiz, 0);

		for (int i = 0; i < niveles.length; i++) {
			if (i == nivel) {
				System.out.println(niveles[i] + "estan en el nivel: " + (++i));
			}
		}
	}

	/**
	 * En este metodo, se implementa la recursividad en donde se utiliza algo
	 * similar al recorrido en orden, y con la diferencia de que se le asigna los
	 * noveles del albor y se obtinen los nodos.
	 * 
	 * @param n      es el nodo (raiz).
	 * 
	 * @param nivel2 recibe el nivel para el recorrido.
	 */
	private void imprimirNivel(Nodo n, int nivel2) {
		if (n != null) {
			niveles[nivel2] = n.getDato() + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
			imprimirNivel(n.getHijoIzq(), nivel2 + 1);
			imprimirNivel(n.getHijoDer(), nivel2 + 1);
		}
	}

}
