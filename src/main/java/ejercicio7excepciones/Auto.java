package ejercicio7excepciones;

public class Auto {

	private int velocidad;

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public int acelerar() throws ExcesoVelocidadException {
		int diez = 10;
		int nueva = getVelocidad() + diez;
		if (nueva>40) {
			throw new ExcesoVelocidadException();
		}
	this.setVelocidad(nueva);
	System.out.println("Velocidad: " + nueva);
	return getVelocidad();
	}
	
	
	public int frenar() throws AutoDetenidoException {
		int diez = 10;
		int nueva = getVelocidad() - diez;
		if (nueva==0) {
			throw new AutoDetenidoException();
		}
	this.setVelocidad(nueva);
	System.out.println("Velocidad: " + nueva);
	return getVelocidad();
	}
	
}
