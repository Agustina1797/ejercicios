package EjerciciosExcepciones;

import java.util.Scanner;

public class AppExcepciones {

	public static void main(String[] args) {
		
	
//	try {
//		int num = 0;
//		int resultado = num/num;
//		System.out.println("El resultado es: " + resultado);
//		}
//	catch (ArithmeticException e) {
//		System.out.println("Excepcion: " + e.getMessage());
//		System.out.println("Ingrese numero diferente a 0");
//	}
//	catch (NullPointerException en) {
//		System.out.println("Null pointer");
//	}
//	
		
		
		Scanner sc = new Scanner(System.in);
		
		Pasaje[] pasaje = new Pasaje[3];  //ARRAY
		Pasaje vp = new Pasaje();
		int vendido  = 0;
		
		
		try {
		
		while(true){
		System.out.println("Ingrese nombre del pasajero");
		String nombre = sc.next();
		System.out.println("Ingrese dni del pasajero");
		int dni = sc.nextInt();
		Pasaje pasajero = new Pasaje(nombre, dni);
		
		try {
			vp.vender(pasajero, pasajes, vendido);
		}catch (SinPasajeException e){
			System.out.println("No hay pasajes, intente otro dia")
		}
//		pasaje [vendido]= pasajero;
//		vendido++;
//		System.out.println("Operacion realizada");
		}
		
		}catch (Exception e) {
			
		}
		finally {   //opcional
	
			// for(Pasaje vendido : pasajero) {
		for(int i = 0; i < 3; i++) {
		System.out.println("Pasajeros: " + pasaje[i]);
		
		}
		}
		
	}
}
