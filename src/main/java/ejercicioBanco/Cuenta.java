package ejercicioBanco;

public abstract class Cuenta {
	private String numero;
	private float saldo;
	
	public abstract float extraer(float importe) throws SaldoException;

	public Cuenta(String numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float depositar(float importe) {
		this.saldo = this.saldo + importe;
		System.out.println("Saldo: " + saldo);
		return this.saldo;
	}
}
