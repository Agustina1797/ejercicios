package ejercicioHibernate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ejercicio9.jdbc.Emplyee;
import ejercicio9.jdbc.dao.EmployeeDao;

public class TestCliente {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("SISTEMA DE ABM DE CLIENTES");
		System.out.println("1 - ALTA     2 - MODIFICACION     3 - BAJA     4 - LISTADO     5 - SUELDO     0 - SALIR");
		int opcion = sc.nextInt();
		while (opcion != 0) {

			switch (opcion) {
			case 1:
				insertar(sc);
				break;

			case 2:
				modificar(sc);
				break;

			case 3:
				eliminar(sc);
				break;

			case 4:
				listar();

			case 5:
				System.out.println("1 - AGREGAR      2 - LISTAR");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					SalarioMap sala = new SalarioMap();
					System.out.println("MES: ");
					int mes = sc.nextInt();
					System.out.println("TOTAL: ");
					Float total = sc.nextFloat();
					System.out.println("ID CLIENTE: ");
					int id = sc.nextInt();
					sala.setMes(mes);
					sala.setFecha(new Date());
					sala.setTotal(total);
					ClienteDao clidao = new ClienteDao();
					ClienteEntity cliente = new ClienteEntity();
					cliente = clidao.getCliente(id);
					sala.setClientesal(cliente);
					SalarioDao saldao = new SalarioDao();
					saldao.insertSalario(sala);

				case 2:
					SalarioDao sald = new SalarioDao();
					List<SalarioMap> listasal = sald.getAllSalario();
					for (SalarioMap sm : listasal) {
						System.out.println(sm.getId() + " " + sm.getMes() + " " + sm.getTotal() + " "
								+ sm.getClientesal() + " " + sm.getFecha());
					}
				}
			}

		}

	}

	private static void listar() {
		ClienteDao clidao = new ClienteDao();
		List<ClienteEntity> lista = clidao.getAllCliente();
		for (int i = 0; i < lista.size(); i++) {
			ClienteEntity listemp = (ClienteEntity) lista.get(i);
			System.out.println(listemp.getId() + " " + listemp.getFirstName() + " " + listemp.getLastName() + " "
					+ listemp.getEmail());
		}

	}

	private static void eliminar(Scanner sc) throws SQLException {
		System.out.println("Ingrese id a eliminar:");
		int id = sc.nextInt();
		ClienteEntity cliente = buscar(id);

		if (cliente == null) {
			System.out.println("No existe el id");
		} else {

			ClienteDao.deleteCliente(cliente);

		}

	}

	private static void modificar(Scanner sc) throws SQLException {

		System.out.println("Ingrese id a modificar:");
		int id = sc.nextInt();
		ClienteEntity cliente = buscar(id);
		if (cliente == null) {

			System.out.println("No existe el id");
		} else {
			System.out.println("Ingrese email:");
			String email = sc.next();
			System.out.println("Ingrese nombre:");
			String nombre = sc.next();
			System.out.println("Ingrese apellido:");
			String apellido = sc.next();

			ClienteEntity cli = new ClienteEntity();
			cli.setId(id);
			cli.setEmail(email);
			;
			cli.setFirstName(nombre);
			cli.setLastName(apellido);

			ClienteDao clidao = new ClienteDao();
			clidao.insertCliente(cli);
		}
	}

	private static void insertar(Scanner sc) {

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
	}

	private static ClienteEntity buscar(int id) throws SQLException {
		ClienteEntity cli = ClienteDao.getCliente(id);
		return cli;
	}

}
