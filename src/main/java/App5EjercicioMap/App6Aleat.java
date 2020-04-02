package App5EjercicioMap;

import java.util.Random;
import java.util.Scanner;

//adivinar numero entre 0 y 9
public class App6Aleat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** ADIVINADOR DE NUMERO ***");
		System.out.println("Ingrese numero");
		int numjugador = sc.nextInt();
		int aleat = GenAleatorio.aleatorio();
		int contador = 0;
		
		while (contador < 5 && aleat != numjugador) {

			if (numjugador == aleat) {
				System.out.println("*** NUMERO CORRECTO ***");
			} else {
				System.out.println("*** NUMERO INCORRECTO ***");
				System.out.println("INTENTOS: " + contador);
			}
			System.out.println("Ingrese numero");
		    numjugador = sc.nextInt();
			contador = contador+1;
		}
		
		System.out.println("*** ¿SEGUIR JUGANDO? ***");
		System.out.println(" 1 - SI        2 - NO ");
		int opc = sc.nextInt();
	
		if (opc== 1) {
			System.out.println("*** ADIVINADOR DE NUMERO ***");
			System.out.println("Ingrese numero");
			numjugador = sc.nextInt();
			contador = 0;
			while (contador < 5) {

				if (numjugador == aleat) {
					System.out.println("*** NUMERO CORRECTO ***");
				} else {
					System.out.println("*** NUMERO INCORRECTO ***");
					System.out.println("INTENTOS: " + contador);
				}
				System.out.println("Ingrese numero");
			    numjugador = sc.nextInt();
				contador = contador+1;
			}
		
			System.out.println("*** ¿SEGUIR JUGANDO? ***");
			System.out.println(" 1 - SI        2 - NO ");
			opc = sc.nextInt();
		}else {
			System.out.println("*** FIN DEL JUEGO ***");
		}
	}

}
