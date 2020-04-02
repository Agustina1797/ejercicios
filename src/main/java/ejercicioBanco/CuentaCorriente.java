package ejercicioBanco;

public class CuentaCorriente extends Cuenta {

	private float descubierto;

	public CuentaCorriente(String numero, float saldo, float descub) {
		super(numero, saldo);
		this.descubierto = descub;
	}

	public float getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(float descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public float extraer(float importe) throws SaldoException {
		if (getSaldo() + getDescubierto() < importe) {
			throw new SaldoException("Sin disponible");
		}
		else {
			float actual = getSaldo() ;
			actual = actual - importe;
			System.out.println("Saldo: " + actual);
			return actual;
		}
	}


}
