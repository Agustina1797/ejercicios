package App5EjercicioMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class App5 {

	public static void main (String[] args) {
		String texto = "El celular se convirtió en los últimos años en el gran aliado del ser humano en casi todo el planeta. Ya es una obviedad contar todo lo que se puede hacer con este aparato inteligente, con wifi o incluso con un paquete de datos. Y en estos días de cuarentena total, la relación con el smartphone se intensificó aún mas. La gente se informa, opina en las redes, hace videollamadas con amigos y familiares a distancia -la que sea, da igual un vecino del edificio o alguien de un país lejano-. Y por supuesto, se reciben cientos de mensajes, entre ellos muchos memes, del coronavirus o lo que fuera. \r\n" + 
				"\r\n" + 
				"Pero hubo un mensaje que se viralizó y que sorprendió a todos los que recibieron un link con canciones en 8D, o en 8 Dimensiones. ¿Qué es? ¿Un virus? ¿Hay que pagar? ¿Por qué dice que sí o sí tengo que ponerme auriculares? ¿No serán los falsos gemidos, no? Claro que para los especialistas en música no es una novedad, pero para el resto, es un cambio rotundo en la forma de disfrutar de la música.";
	
//	Palabras arrayPalabras = new Palabras();
		String[] arrayPalabras = texto.split(" ");
//		System.out.println(arrayPalabras.length);
//		System.out.println(arrayPalabras[0]);
	
	
	Map<String, Integer>	mapa= new HashMap<String, Integer>();
	for (int i = 0; i< arrayPalabras.length; i++) {
		String palabra = arrayPalabras[i].toLowerCase();//todo en minuscula, unificar el criterio
		if (mapa.get(palabra) !=null) {
			int cant = mapa.get(palabra);
			cant++;
			mapa.put(palabra, cant);
		}else {
			mapa.put(palabra, 1);
		}
	
	}
	//iterar el mapa
	Set<String> claveSet = mapa.keySet();    //conjunto de las claves(string)
	Iterator<String> it = claveSet.iterator();
	int max=0;
	String maxPal= "";
	List<Contador>listatot = new ArrayList<Contador>();   //inicializacion de la lista
	
	while (it.hasNext()) {
		String palabra = it.next();
		int valor= mapa.get(palabra);
		if (valor > max) {
			max = valor;
			maxPal = palabra;
			
		}
		Contador contpal = new Contador ();
		contpal.setContar(valor);
		contpal.setPalabra(palabra);
		listatot.add(contpal);
	}
	System.out.println("palabra mas repetida: " + maxPal + " ,con " + max);
    Collections.sort(listatot);
	//imprimir lista
	for (int i=0; i < listatot.size(); i++) {
		Contador contpal = listatot.get(i);
		System.out.println(contpal.getPalabra() + ", " + contpal.getContar());
	}
	
	
	
	}
}
