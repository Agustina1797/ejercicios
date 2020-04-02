package ejercicioBanco;
import java.util.Scanner;
public class AppBancoException {
	private static CajaAhorro ca = new CajaAhorro("001", 0);
	private static CuentaCorriente cc = new CuentaCorriente("002", 0, 100);
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Sistema de banco");
		System.out.println();

		System.out.println("Opciones: 1. deposito 2. extraccion 0. salir");
		int opcion = sc.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				deposito();
				break;
			case 2:
				extraccion();
				break;

			}

			System.out.println("Opciones: 1. deposito 2. extraccion 0. salir");
			opcion = sc.nextInt();
		}
	}

	private static void extraccion() {
		System.out.println("Opciones: 1. C.Ahorro 2. C.Corriente");
		int cuenta = sc.nextInt();
		System.out.println("Ingrese importe");
		float importe = sc.nextFloat();

		if (cuenta == 1) {
			try {
				ca.extraer(importe);
			} catch (SaldoException e) {
				System.out.println(e.getMessage());
			}
		} else {
			try {
				cc.extraer(importe);
			} catch (SaldoException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	private static void deposito() {
		System.out.println("Opciones: 1. C.Ahorro 2. C.Corriente");
		int cuenta = sc.nextInt();
		System.out.println("Ingrese importe");
		float importe = sc.nextFloat();

		if (cuenta == 1) {
			ca.depositar(importe);
		} else {
			cc.depositar(importe);
		}

	}

}
