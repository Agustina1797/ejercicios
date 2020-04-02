package EjerciciosExcepciones;

public class Pasaje {


	
	public Pasaje(String nombre , int dni) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}



	private int dni;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString() {
		return nombre + " " + dni;
	}
}
