package fes.aragon.listaDoble.t;

/**
 * En la siguiente clase se pondra a prueba algunos metodos pricipales para ver el funcionamiento de las listas 
 * dobles.
 * 
 * Un ejemplo sencillo, podemos imaginarnos el trafico en una calle de la CDMX, como se muestra abajo. 
 * 
 * |==================================================================================
 * | [Coche Rojo][Coche Amarillo][Coche Azul][Coche Negro][Coche Verde][Coche Blanco]
 * |==================================================================================
 * 
 * podemos observar que el coche blanco encabeza (la lista doblemente enlazada) el trafico. 
 * (Esto si observamos que la direcion va de izquierda a derecha para avanzar)
 * 
 * Tenemos que recorrer la lista doble en ambos sentidos tanto del coche blanco al rojo como del coche rojo al blanco. 
 * 
 * 
 * @author Julio Cesar Morales
 *
 */

public class Prueba {
	
	public static void main(String[] args) {
		
		TDAListaDoble<String> calle = new TDAListaDoble<>();
		
		calle.insertarCabeza("Coche Blanco");
		calle.insertarCola("Coche Verde");
		calle.insertarCola("Coche Negro");
		calle.insertarCola("Coche Azul");
		calle.insertarCola("Coche Amarillo");
		calle.insertarCola("Coche Rojo");
		
		System.out.println("\nMostramos la lista del Coche Blanco al Coche Rojo\n");
		calle.mostrarDatosCabezaACola();
		
		System.out.println("\nMostramos la lista del Coche Rojo al Coche Blanco\n");
		calle.mostrarDatosColaAcabeza();
		
		System.out.println("\nEliminanos el Coche Blanco\n");
		calle.eliminarDato("Coche Blanco");
		calle.mostrarDatosCabezaACola();
		
	}
}
