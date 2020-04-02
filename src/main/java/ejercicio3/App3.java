package ejercicio3;

import java.util.Scanner;

public class App3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULO DE BASE");
		System.out.println("1- TRIANGULO    2- RECTANGULO    0- SALIR");
		int opc = sc.nextInt();
		
		while (opc != 0) {
			
			if (opc == 1) {
			
			Triangulo tri = new Triangulo();
		
			System.out.println("INGRESE MEDIDA DE LA BASE");
			int base = sc.nextInt();
			
			System.out.println("INGRESE MEDIDA DE LA ALTURA");
			int altura = sc.nextInt();
			
		    tri.setAltura(altura);
		    tri.setBase(base);
		    
		    System.out.println(tri.area());
			
		}else if (opc == 2) {
			
			Rectangulo rec = new Rectangulo();
			
			System.out.println("INGRESE MEDIDA DE LA BASE");
			int base = sc.nextInt();
			
			System.out.println("INGRESE MEDIDA DE LA ALTURA");
			int altura = sc.nextInt();
			
		    rec.setAltura(altura);
		    rec.setBase(base);
		    
			System.out.println(rec.area());
			
		}
			
			System.out.println("CALCULO DE BASE");
			System.out.println("1- TRIANGULO    2- RECTANGULO    0- SALIR");
			opc = sc.nextInt();
			
		}
		
		System.out.println("fin de aplicacion");
	
	}



}
