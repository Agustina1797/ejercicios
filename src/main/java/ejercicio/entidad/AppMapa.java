package ejercicio.entidad;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class AppMapa {
	
	public static void main(String[] args) {
		
		Map<Empleado, Integer> mapa= new HashMap<Empleado, Integer>();
		Empleado emp = new Empleado("Pedro", 2323, 23232);
		Empleado emp2 = new Empleado("Maria", 2345, 6576);
		System.out.println("Mapa: " + mapa.size());
		mapa.put(emp, 223344500);
		System.out.println("Mapa: " + mapa.size());
		mapa.put(emp2, 223445511);
		System.out.println("Mapa: " + mapa.size());
		Empleado emp3 =new Empleado("Ana ", 344, 5456);
		mapa.put(emp3, 223345522);
		System.out.println("Mapa: " + mapa.size());
		
		Set<Empleado> claveSet = mapa.keySet();
		Iterator<Empleado> it = claveSet.iterator();
		while (it.hasNext()) {
			Empleado clave = it.next();
			System.out.println("Clave: " + clave.getNombre());
			System.out.println("Valor: " + mapa.get(clave));
			}
		
		
		
		
		
	}

}
