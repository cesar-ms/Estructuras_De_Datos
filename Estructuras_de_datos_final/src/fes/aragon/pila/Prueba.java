package fes.aragon.pila;

import java.util.Iterator;

import javax.sound.midi.Soundbank;

/***
 * 
 * 
 * Para demostrar el funcionamiento de la pila vamos a tomar un ejemplo de la vida cotidiana donde 
 * aparecen este tipo de estructura de datos. 
 * 
 * Un ejemplo sencillo es una aglomeracion de platos apilados unos encima del otros.
 * 
 * 
 * @author Julio Cesar Morales 
 *
 */

public class Prueba {
	
	public static void main(String[] args) {
		
		Pila<String> plato = new Pila<>();
		
		System.out.println("");
		
		plato.insertar("Plato 1");
		plato.insertar("Plato 2");
		plato.insertar("Plato 3");
		plato.insertar("Plato 4");
		plato.insertar("Plato 5");
		plato.insertar("Plato 6");
		plato.insertar("Plato 7");
		plato.insertar("Plato 8");
		plato.insertar("Plato 9");
		plato.insertar("Plato 10");
		
		plato.mostrarPila();

		System.out.println("\nEl ultimo plato apilado: " + plato.verArriba());
		
		System.out.println("\nSacamos el ultimo plato apilado y mostramos la pila...\n");
	    
		plato.sacar();
		
		plato.mostrarPila();
		
		System.out.println("\nLa pila funciona correctamente");
		
		
	}

}
