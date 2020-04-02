package ejercicio.entidad;

public class Empleado extends Persona {
		

	public Empleado(String nombre, int dni, float sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
	}

	private float sueldo;
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	@Override
	public float getDescuento (float total) {
		return total * 0.9f;
	}

}