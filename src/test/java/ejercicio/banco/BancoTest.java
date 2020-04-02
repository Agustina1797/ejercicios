package ejercicio.banco;

import ejercicioBanco.CajaAhorro;
import ejercicioBanco.CuentaCorriente;
import ejercicioBanco.SaldoException;
import junit.framework.TestCase;

public class BancoTest extends TestCase {

	public void testDepositarCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		ca.depositar(200);
		assertTrue(ca.getSaldo() == 300);
	}

	public void testRetiroCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		try {
			ca.extraer(50);
		} catch (SaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(ca.getSaldo() == 50);
	}

	public void testRetiroCC() {
		CuentaCorriente cc = new CuentaCorriente("002", 100, 100);
		try {
			cc.extraer(200);
		} catch (SaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testDepositarCC() {
		CuentaCorriente cc = new CuentaCorriente("002", 100, 100);
		cc.depositar(500);
		assertTrue(cc.getSaldo() == 600);
	}
}
