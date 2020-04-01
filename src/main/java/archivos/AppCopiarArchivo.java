package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class AppCopiarArchivo {

	public static void main(String[] args) {

		try {
			FileReader viejo = new FileReader("C:\\Users\\rolon\\Documents\\ejercicio1.txt");
			BufferedReader vi = new BufferedReader(viejo);
			File nuevo = new File("C:\\Users\\rolon\\Documents\\ejercicio1copia.txt");
			FileOutputStream nu;
			nu = new FileOutputStream(nuevo);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(nu));
			String i;
			while ((i = vi.readLine()) != null) {

				bw.write(i);
				bw.newLine();

			}
			vi.close();
			viejo.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}