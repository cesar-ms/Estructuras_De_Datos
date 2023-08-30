package fes.aragon.DiccionarioArbol;

/**
 * 
 * Esta clase presenta la informacion de un alumno, como por ejemplo, nombre,
 * promedio y apellidos.
 * 
 * 
 * @author Julio Cesar Morales
 *
 */
public class Alumno {

	private String Nombre;
	private String APE;
	private String APM;
	private float Promedio;

	/**
	 * Constructor
	 */

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el nombre del alumno
	 * 
	 * @return
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * Establece el nombre del alumno 
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * Obtiene el apellido paterno del alumno
	 * @return
	 */
	public String getAPE() {
		return APE;
	}

	/**
	 * Establece el apellido paterno del alumno
	 * @param aPE
	 */
	public void setAPE(String aPE) {
		APE = aPE;
	}

	/**
	 * Obtiene el apellido materno del alumno
	 * 
	 * @return
	 */
	public String getAPM() {
		return APM;
	}

	/**
	 * Establece el apellido materno del alumno
	 * 
	 * @param aPM
	 */
	public void setAPM(String aPM) {
		APM = aPM;
	}

	/**
	 * Obtiene el promedio del alumno
	 * @return
	 */
	public float getPromedio() {
		return Promedio;
	}

	/**
	 * Establece el promedio del alumno
	 * 
	 * @param promedio
	 */
	public void setPromedio(float promedio) {
		Promedio = promedio;
	}

	/**
	 * Imprieme en consola el alumno y sus atributos. 
	 */
	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", APE=" + APE + ", APM=" + APM + ", Promedio=" + Promedio + "]";
	}

}
