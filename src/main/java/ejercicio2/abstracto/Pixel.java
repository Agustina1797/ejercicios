package ejercicio2.abstracto;

public abstract class Pixel {

	public Pixel(int pixel) {
		super();
		this.pixel = pixel;
	}



	protected int pixel;

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}  
	
	
	
	protected abstract float facturar();

	
	
}
