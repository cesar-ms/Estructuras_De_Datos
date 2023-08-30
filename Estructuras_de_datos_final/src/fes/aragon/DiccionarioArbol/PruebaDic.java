package fes.aragon.DiccionarioArbol;

 /**
  * 
  * @author Julio Cesar Morales
  *
  */

public class PruebaDic {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		DiccionarioB<Integer> arbol = new DiccionarioB<>();
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		Alumno alumno4 = new Alumno();
		Alumno alumno5 = new Alumno();
		Alumno alumno6 = new Alumno();
		Alumno alumno7 = new Alumno();
		Alumno alumno8 = new Alumno();
		Alumno alumno9 = new Alumno();
		Alumno alumno10 = new Alumno();
		Alumno alumno11 = new Alumno();
		Alumno alumno12 = new Alumno();
		Alumno alumno13 = new Alumno();
		Alumno alumno14 = new Alumno();
		Alumno alumno15 = new Alumno();
		
		alumno1.setNombre("Julio cesar");
		alumno1.setAPE("Morales");
		alumno1.setAPM("Sierra");
		alumno1.setPromedio(123);
		
		alumno7.setNombre("Toño");
		alumno7.setAPE("Cabañas");
		alumno7.setAPM("Gervasio");
		alumno7.setPromedio(180);
		
		
		alumno15.setNombre("Samuel");
		alumno15.setAPE("Ramirez");
		alumno15.setAPM("Hernandez");
		alumno15.setPromedio(190);
		
		
		arbol.insertar(50, alumno1);
		arbol.insertar(40, alumno2);
		arbol.insertar(80, alumno3);
		arbol.insertar(35, alumno4);
		arbol.insertar(48, alumno5);
		arbol.insertar(70, alumno6);
		arbol.insertar(82, alumno7);
		arbol.insertar(25, alumno8);
		arbol.insertar(37, alumno9);
		arbol.insertar(47, alumno10);
		arbol.insertar(49, alumno11);
		arbol.insertar(65, alumno12);
		arbol.insertar(77, alumno13);
		arbol.insertar(81, alumno14);
		arbol.insertar(88, alumno15);
		
		System.out.println("\n"+arbol.buscar(50));
		System.out.println("\n"+arbol.buscar(88));
		System.out.println("\n"+arbol.buscar(82));
		
		System.out.println("\n========Arbol Completo========\n");
		arbol.imprimirArbol(arbol.getRaiz());
		
	}

}
