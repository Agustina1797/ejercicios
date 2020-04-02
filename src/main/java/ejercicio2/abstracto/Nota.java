package ejercicio2.abstracto;

public class Nota extends Pixel {
	



	public Nota(int pixel, int valorNota, String autor, String titulo) {
		super(pixel);
		this.valorNota = valorNota;
		this.autor = autor;
		this.titulo = titulo;
	}



	int valorNota = 2;
	
	private String autor;
	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	private String titulo;
	


	@Override
	protected float facturar() {
		
		return pixel * valorNota * -1; 
	}
	
	public String toString() {
		return autor + " " + titulo + " " + valorNota;
	}
	
	

}
