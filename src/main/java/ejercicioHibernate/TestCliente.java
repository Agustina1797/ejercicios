package ejercicioHibernate;

import java.util.Scanner;


public class TestCliente {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ClienteEntity cli = new ClienteEntity();
		System.out.println("Ingrese email");
		String email = sc.next();
		System.out.println("Ingrese nombre");
		String nombre = sc.next();
		System.out.println("Ingrese apellido");
		String ape = sc.next();
		cli.setEmail(email);
		cli.setFirstName(nombre);
		cli.setLastName(ape);
		
		ClienteDao clidao = new ClienteDao();
		clidao.insertCliente(cli);
		
		
		
		System.out.println("Ingrese id de cliente a borrar: ");
		int id = sc.nextInt();
		
		ClienteEntity cliborrar = new ClienteEntity();
		cliborrar.setId(id);
		clidao.deleteCliente(cliborrar);

		clidao.getAllClientes();
		HibernateUtil.shutdown();
	}

}
