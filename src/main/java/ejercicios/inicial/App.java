package ejercicios.inicial;

import java.util.Scanner;

import ejercicio.entidad.Persona;


// esto es comentario
public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Ingrese nombre ");
		String nombre = sc.next();
		
		System.out.println("Ingrese DNI ");
		int dni = sc.nextInt();
	
		Persona per = new Persona(nombre, dni);
		
		System.out.println("Persona: " + per);
	}

}
