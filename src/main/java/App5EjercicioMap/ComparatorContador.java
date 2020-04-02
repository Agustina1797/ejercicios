/**
 * Clase para comparar dos objetos de tipo Contador(clase
 */



package App5EjercicioMap;

import java.util.Comparator;

public class ComparatorContador implements Comparator<Contador> {
	/**
	 * Metodo para comparar dos Contador segun la palabra
	 */
	public int compare(Contador o, Contador o1) {
		return o.getPalabra().compareTo(o1.getPalabra());
	}

}
