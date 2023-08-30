package fes.aragon.cola;

/**
 * 
 *  Las colas son lo que experimentamos casi en la mayor parte del dia, ya sea en un automóvil, 
 *  en una fila de un banco o algun otro servicio.
 *  
 *  En este caso probaremos la cola con una fila de un supermercado donde los clientes van a pagar su compra.  
 * 
 * @author Julio Cesar Morales
 *
 */

public class Prueba {
	
	
	
	public static void main(String[] args) {
		
		Cola<String> cola = new Cola<>();
		
		System.out.println("");
		
		cola.insertar("Pablo"); // pablo es el primero en llegar y el primero en salir
		cola.insertar("Jose");
		cola.insertar("Ramona");
		cola.insertar("Miguel");
		cola.insertar("Abigail");
		cola.insertar("Antonio");
		cola.insertar("Camilo");
		cola.insertar("Mariana");
		
		
		
		cola.verCola();
		
		System.out.println("\nPrimero en ser atendido: " + cola.verArriba());
		
		cola.sacar(); 
		
		System.out.println("\nCliente atendido... Mostrando cola actualizada. \n");
		
		cola.verCola();
		
		System.out.println("\nSegundo en ser atendido: " + cola.verArriba());  

		//Hasta aqui termina el ejemplo...
		
		//Se puede mejorar recorriendo toda cola hasta el ultimo cliente. 
	}
}
