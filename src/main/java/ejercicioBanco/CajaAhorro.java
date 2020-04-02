package ejercicioBanco;

public class CajaAhorro extends Cuenta {

	public CajaAhorro(String numero, float saldo) {
		super(numero, saldo);
	}


	public float extraer(float importe) throws SaldoException {
		float actual = 0;
		if (this.getSaldo() < importe) {
			throw new SaldoException("No tiene saldo");
		}
		else {
			actual = this.getSaldo();
			actual = actual - importe;
			this.setSaldo(actual);
			System.out.println("Saldo: " + actual);
		}
		return actual;
	}
}



