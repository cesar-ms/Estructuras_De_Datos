package fes.aragon.DiccionarioArbol;
/**
 * 
 * Clase que permite crear un diccionario binario, es decir que se ayuda de los arboles binarios.
 * 
 * @author Julio Cesar Morales
 *
 * @param <T>
 */
public class DiccionarioB<T>{
	
	private Nodo<T> raiz;

	public DiccionarioB(){
		super();
		this.raiz = null;
	}
	
	public Nodo<T> getRaiz(){
		return this.raiz;
	}
	
	/**
	 * 
	 * Este metodo inserta a los alumnos en el arbol junto con su clave de identificacion.
	 * 
	 * 
	 * @param clave
	 * @param dato
	 */
	public void insertar(T clave,Alumno dato){
		Nodo<T> n = raiz,previo = null;
		while(n!=null){
			previo= n;
			if(n.comparaMenor(clave)){
				n=n.getHijoDer();
			}else{
				n=n.getHijoIzq();
			}
		}
		if(raiz == null){
			raiz = new Nodo(clave, dato);
		}else{
			if(previo.comparaMenor(clave)){
				previo.setHijoDer(new Nodo(clave, dato));
			}else{
				previo.setHijoIzq(new Nodo(clave, dato));
			}
		}
	}
	
	/**
	 * Busca la clave del alumno, extrayendo la informacion de dicho alumno.  
	 * @param clave
	 * @return
	 */
	public Alumno buscar (T clave){
		Nodo<T> n = raiz; 
		Alumno info = null;
		while(n!= null){
			if(n.getClave().equals(clave)){
				break;
			}
			if(n.comparaMenor(clave)){
				n= n.getHijoDer();
			}else{
				n= n.getHijoIzq();
			}
		}
		info = n.getDato();
		return info;
	}
	
	/**
	 * Metodo que imprime todos los alumnos que hay en el arbol.
	 * desde el primero hasta el ultimo, utilizando la recursividad.
	 * 
	 */
	
	public void imprimirArbol(Nodo<T> n) {
		
		if (n != null) {
			System.out.println("Clave: "+n.getClave() +" "+ n.getDato());
			imprimirArbol(n.getHijoIzq());
			imprimirArbol(n.getHijoDer());
		}
	
	}
	
	
	
	
}
