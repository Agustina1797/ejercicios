package ejercicio2.abstracto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totpubli = 4;

		Pixel[] pagina = new Pixel[totpubli];

		for (int i = 0; i < totpubli; i++) {

			

			System.out.println("1- PUBLICIDAD o 2- NOTA");
			int opc = sc.nextInt();
			
			if (opc == 1) {
				
				System.out.println("Ingrese dimension");
				int totpixel = sc.nextInt();
				
				System.out.println("ingrese marca");
				String marca = sc.next();
				
				Publicidad publi = new Publicidad(marca, totpixel);
				
				//publi.setMarca(marca);
				//publi.setPixel(totpixel);
				
				pagina[i]=publi;

			} else {
				
				
				System.out.println("Ingrese dimension");
				int totpixel = sc.nextInt();

				System.out.println("Ingrese titulo");
				String titulo = sc.next();
				
				System.out.println("Ingrese autor");
				String autor = sc.next();
				
				Nota nota= new Nota(autor, titulo, totpixel);
				
				//nota.setAutor(autor);
				//nota.setPixel(totpixel);
				//nota.setTitulo(titulo);
				
				pagina [i]= nota;
		}
       
		
		}
		
		float total =0;
		
		for (int i=0 ; i < totpubli ; i++) {
			
			total= total + pagina[i].facturar();
			System.out.println(pagina[i]);
		}
		
		System.out.println("Total pagina: "+total);

	}

}
