package ejercicios.inicial;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import ejercicio.entidad.Cliente;
import ejercicio.entidad.Empleado;
import ejercicio.entidad.Persona;


// esto es comentario
public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
//		System.out.println("Ingrese nombre ");
//		String nombre = sc.next();
		
//		System.out.println("Ingrese DNI ");
//		int dni = sc.nextInt();
	
//		Persona per = new Persona(nombre, dni);
		
//		System.out.println("Persona: " + per);
		
		Set<String> conj = new HashSet();
		
		System.out.println("Ingrese nombre ");
		String nombreemp = sc.next();
		
		System.out.println("Ingrese DNI ");
		int dniemp = sc.nextInt();
		
		System.out.println("Ingrese sueldo ");
		int sueldo = sc.nextInt();
		
		System.out.println("Ingrese total venta");
		float ventaTotal = sc.nextFloat();
	
		Empleado emp = new Empleado(nombreemp, dniemp, sueldo);
		conj.add(emp);
		
		float totalNetoEmp = emp.getDescuento(ventaTotal);
		
		
		System.out.println("Empleado: " + conj);
		System.out.println("Neto empleado:  " + totalNetoEmp);
		
		
		
	//	System.out.println("Ingrese nombre ");
	//	String nombrecli = sc.next();
		
	//	System.out.println("Ingrese DNI ");
	//	int dnicli = sc.nextInt();
		
	//	System.out.println("Ingrese sueldo ");
	//	String cuit = sc.next();
	    
	//	System.out.println("Ingrese total venta");
	//	float ventaTotalCli = sc.nextFloat();
		
		
	//	Cliente cli = new Cliente(nombrecli, dnicli, cuit);
		
	//	float totalNeto = cli.getDescuento(ventaTotalCli);
		
	//	System.out.println("Cliente: " + cli);
		
	//	System.out.println("Neto cliente:  " + totalNeto);
		
	}

}
