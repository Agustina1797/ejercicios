package App5EjercicioMap;

public class Contador implements Comparable<Contador> {

	private int contar;
	private String palabra;
	
	
	public int getContar() {
		return contar;
	}
	public void setContar(int contar) {
		this.contar = contar;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public int compareTo(Contador o) {
	
		return   o.getContar() - this.getContar();
	}
}
