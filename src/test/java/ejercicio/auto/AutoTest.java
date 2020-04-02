package ejercicio.auto;

import ejercicio7excepciones.Auto;
import ejercicio7excepciones.AutoDetenidoException;
import ejercicio7excepciones.ExcesoVelocidadException;
import junit.framework.TestCase;

public class AutoTest extends TestCase {

	public void testAutoAcelerarFrenar() {
		Auto auto = new Auto();
		try {
			auto.acelerar();
			auto.acelerar();
			auto.frenar();
			auto.acelerar();
		} catch (ExcesoVelocidadException e) {
			e.printStackTrace();
		} catch (AutoDetenidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int velo = auto.getVelocidad();
		assertTrue(velo == 20);

	}

	public void testAutoAcelerar() {
		Auto auto = new Auto();
		try {
			auto.acelerar();
			auto.acelerar();
			auto.acelerar();
			auto.acelerar();
		} catch (ExcesoVelocidadException e) {
			e.printStackTrace();
		}
		int velo = auto.getVelocidad();
		assertTrue(velo == 40);

	}

	public void testAutoFrenar() {
		Auto auto = new Auto();
		try {
			auto.acelerar();
			auto.acelerar();
			auto.acelerar();
			auto.acelerar();
			auto.frenar();
			auto.frenar();
			auto.frenar();

		} catch (ExcesoVelocidadException e) {
			e.printStackTrace();
		} catch (AutoDetenidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int velo = auto.getVelocidad();
		assertTrue(velo == 10);

	}

}