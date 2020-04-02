package ejercicio.entidad;

public class Cliente extends Persona {
	
	public Cliente(String nombre, int dni, String cuit) {
		super(nombre, dni);
		this.cuit = cuit;
	}
	
	private String cuit;

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	
	@Override
	public float getDescuento (float total) {
		return total * 0.5f;
	}

	

}
