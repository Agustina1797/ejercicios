package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AppLecturaArchivo {

	public static void main(String[] args)  {
		try {
		FileReader fr = new FileReader("C:\\Users\\rolon\\Documents\\app.txt");
		BufferedReader br = new BufferedReader(fr);

		String i;
		while ((i = br.readLine()) != null) {
			System.out.print(i);
		}
		br.close();
		fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		File fout = new File ("C:\\Users\\rolon\\Documents\\escrito.txt");
		FileOutputStream fos;
		try {
			fos= new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			for (int j=0; j<10; j++) {
				bw.write("Something " + j );
				bw.newLine();
				
			}
		bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		
		}
		
		
		
		
		
	}

}
