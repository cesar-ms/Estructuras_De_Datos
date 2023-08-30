package fes.aragon.lista;

import java.util.Iterator;

import javax.sound.midi.Soundbank;

/**
 * 
 * Un ejemplo sencillo es sacar el promedio de una lista de calificaciones
 * 
 * @author Julio cesar morales
 *
 */

public class Prueba {
	public static void main(String[] args) {
		
		TDAListaSimple calificacion = new TDAListaSimple();
		
		
		System.out.println("\nLista de calificaciones de Manuel\n");
		
		calificacion.insertarCola(10.0f);
		calificacion.insertarCola(8.0f);
		calificacion.insertarCola(7.5f);
		calificacion.insertarCola(6.0f);
		calificacion.insertarCola(9.0f);
		
		
		calificacion.mostrarDatos();
		/*
		 * Una forma de sacar el promedio de estas calificaciones es utilizar 
		 * la longitud de la lista, utilizando el metodo de getLongitud()
		 * 
		 */
		
		float suma = 0.0f;
		
		for (int i = 0; i < calificacion.getLongitud(); i++) {
			
			suma += calificacion.obtenerDato(i);
		}
		
		System.out.println("\nPromedio: " + suma/calificacion.getLongitud());
		
		/*
		 *
		 * Otra forma de hacer esto crear un metodo en TDAListaSimple que nos ayude a sacar el promedio,
		 * sin embargo esto es una demostración para ver si nuestra lista simple funciona correctamente.
		 * 
		 * 
		 */
		
		/*
		 * Prueba de metodos
		 * 
		 */
		
		
		//Eliminanos el 7.5
		calificacion.eliminarIndice(2);
		
		System.out.println("\nEliminamos la calificacion 7.5, (Por indice de Nodo)\n");
		
		
		calificacion.mostrarDatos();
		
		System.out.println("\nEliminamos la calificacion 9.0, (Nodo cola) \n"); 
		
		calificacion.eliminarCola();
		
		calificacion.mostrarDatos();
		
		System.out.println("\nEliminanos la primera calificacion 10.0, (Nodo cabeza)\n");
		
		calificacion.eliminaraCabeza();
		
		calificacion.mostrarDatos();
		

		
		
		
		
		
	}

}
