package ejercicio3;

public abstract class Medidas {
	
	protected float base;
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	protected float altura;
	
	protected abstract float area();   //firma

}
