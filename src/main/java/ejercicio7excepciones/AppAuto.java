package ejercicio7excepciones;

import java.util.Scanner;

public class AppAuto {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	Auto auto = new Auto();
	int velmax=40;
	int vel = 0;
	System.out.println("**** VELOCIDAD ACTUAL: " + auto.getVelocidad() + " ****");
	System.out.println("1 - ACELERAR       2 - FRENAR      3 - SALIR");
    int opc = sc.nextInt();
    
   while (opc!=3) {
    if (opc==1) {
    	try {
    		auto.acelerar();
    		}catch (ExcesoVelocidadException e) {
    	System.out.println("No se puede acererar más");
    } break;
    }else {
    	try {
    		auto.frenar();
    	}catch (AutoDetenidoException e) { 
    		System.out.println("No se puede frenar más");
    	}break;
    }
    System.out.println("1 - ACELERAR       2 - FRENAR      3 - SALIR");
    opc = sc.nextInt();
    }
	
	}
	
	
		
}
