package fes.aragon.ArbolBinario;

public class PruebaArbol {
	/**
	 * En esta clase se hacen las pruebas para arboles binarios, en este caso las
	 * pruebas se hicieron para arboles de tipo integer, donde se demuestran los
	 * resultados de los metodos creados en la clase ArbolBinario.
	 * 
	 * 
	 * @param args pertenece al metodo main para ejecutar.
	 */
	public static void main(String[] args) {

		ArbolBinario<Integer> arbol = new ArbolBinario<>();
		System.out.println("<<<<<ARBOL BINARIO>>>>>");
		arbol.insertar(25);
		arbol.insertar(13);
		arbol.insertar(28);
		arbol.insertar(11);
		arbol.insertar(15);
		arbol.insertar(26);
		arbol.insertar(30);
		arbol.insertar(10);
		arbol.insertar(14);
		arbol.insertar(16);
		arbol.insertar(33);
		arbol.insertar(29);
		arbol.insertar(12);
		arbol.insertar(9);
		arbol.insertar(8);
		arbol.recorrerAmplitud();

		System.out.println("---------------");
		System.out.println("PRE-ORDEN");
		arbol.preorden(arbol.getRaiz());

		System.out.println("---------------");
		System.out.println("POST-ORDEN");
		arbol.postOrden(arbol.getRaiz());

		System.out.println("---------------");
		System.out.println("IN-ORDEN");
		arbol.inorden(arbol.getRaiz());

		System.out.println("******MAXIMO Y MINIMO******");
		arbol.maximo();
		arbol.minimo();

		System.out.println("\n*******ALTURA********");
		System.out.println(arbol.Altura(arbol.BuscarNodo(arbol.getRaiz(), 11)));

		System.out.println("\n*****PROFUNDIDAD*****");
		System.out.println(arbol.profundidad(25));

		System.out.println("\n**NIVELES DEL ARBOL**");
		arbol.imprimirNivel(3);

		System.out.println("\n*METODO DE ELIMINACION*");
		arbol.eliminar(13);
		arbol.recorrerAmplitud();
	}

}
