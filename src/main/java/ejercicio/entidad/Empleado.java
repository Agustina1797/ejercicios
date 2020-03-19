package ejercicio.entidad;

public class Empleado extends Persona {
		

	public Empleado(String nombre, int dni, float sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
	}

	private float sueldo;

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}