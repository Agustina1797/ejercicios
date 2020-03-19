package ejercicio.entidad;

public class Persona {
	
	//atributos
	
	protected int dni;
	protected String nombre;
	
	
	//getters setters
	
	public Persona( String nombre, int dni) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
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
