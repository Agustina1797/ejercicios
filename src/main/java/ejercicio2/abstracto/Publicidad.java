package ejercicio2.abstracto;

public class Publicidad extends Pixel{

	
	



	public Publicidad(int pixel, int valorPubli, String marca) {
		super(pixel);
		this.valorPubli = valorPubli;
		this.marca = marca;
	}

	int valorPubli = 10;
	private String marca;
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}


    @Override
	protected float facturar() {
	
		return pixel * valorPubli ;
	}

    public String toString() {
		return marca + " " + valorPubli;
	}
	
	

}
