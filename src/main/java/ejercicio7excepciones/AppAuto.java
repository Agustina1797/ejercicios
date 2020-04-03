package ejercicio7excepciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppAuto {
<<<<<<< HEAD
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);

		Auto auto = new Auto();
		System.out.println("**** VELOCIDAD ACTUAL: " + auto.getVelocidad() + " ****");
		log(auto.getVelocidad());
		System.out.println("1 - ACELERAR       2 - FRENAR      3 - SALIR");
		int opc = sc.nextInt();


		while (opc != 3) {
		//	Date fecha = new Date();
			
			if (opc == 1) {

				try {
					auto.acelerar();
				} catch (ExcesoVelocidadException e) {
					System.out.println("No se puede acererar más");
				}
				log(auto.getVelocidad());
			} else {
				try {
					auto.frenar();
				} catch (AutoDetenidoException e) {
					System.out.println("No se puede frenar más");
				}
				log(auto.getVelocidad());
			}
			System.out.println("1 - ACELERAR       2 - FRENAR      3 - SALIR");
			opc = sc.nextInt();
		}
=======
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
    	System.out.println("No se puede acererar mÃ¡s");
    } 
    }else {
    	try {
    		auto.frenar();
    	}catch (AutoDetenidoException e) { 
    		System.out.println("No se puede frenar mÃ¡s");
    	}
    }
    System.out.println("1 - ACELERAR       2 - FRENAR      3 - SALIR");
    opc = sc.nextInt();
    }
	
	}
	
	
>>>>>>> 0607d6b6a0359e92dff3b0184defea4d7b2446ca
		
	}

	private static void log(int velocidad) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("out.txt", true));

		} catch (IOException e1) {
			System.out.println("Archivo no encontrado");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date momAct = new Date();
		String actual = sdf.format(momAct);
		try {
			bw.write('\n' + actual + " " + velocidad);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
