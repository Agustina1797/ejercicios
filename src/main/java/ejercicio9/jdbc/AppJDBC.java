package ejercicio9.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio9.jdbc.dao.EmployeeDao;

public class AppJDBC {

	public static void main(String[] args) {
		try {
			Connection conection = AdminDB.obtenerConexion();
			System.out.println("SISTEMA DE ABM DE EMPLEADOS");
			System.out.println("1 - ALTA     2 - MODIFICACION     3 - BAJA     4 - LISTADO     0 - SALIR");
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			while (opcion != 0) {

				switch (opcion) {
				case 1:
					insertar(conection, sc);
					break;
				case 2:
					modificar(conection, sc);
					break;
				case 3:
					baja(conection, sc);
					break;
				case 4:
					listar(conection);
					break;

				}

				System.out.println("1 - ALTA     2 - MODIFICACION     3 - BAJA     4 - LISTADO     0 - SALIR");
				opcion = sc.nextInt();
			}
			sc.close();
			conection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No se pudo realizar la operacion " + e.getMessage());
		}
	}

	private static void insertar(Connection conection, Scanner sc) throws SQLException {
		Statement stmt = conection.createStatement();
		System.out.println("Ingrese email:");
		String email = sc.next();
		System.out.println("Ingrese nombre:");
		String nombre = sc.next();
		System.out.println("Ingrese apellido:");
		String apellido = sc.next();

		Emplyee emp = new Emplyee();
		emp.setMail(email);
		emp.setFirstName(nombre);
		emp.setLastName(apellido);
		EmployeeDao.insertar(emp, stmt);

	}

	private static void listar(Connection conection) throws SQLException {

		Statement stmt = conection.createStatement();

		EmployeeDao.listar(stmt);
	}

	private static void modificar(Connection conection, Scanner sc) throws SQLException {
		Statement stmt = conection.createStatement();
		System.out.println("Ingrese id a modificar:");
		int id = sc.nextInt();
		Emplyee empleado = buscar(conection, id);
		if (empleado == null) {

			System.out.println("No existe el id");
		} else {
			System.out.println("Ingrese email:");
			String email = sc.next();
			System.out.println("Ingrese nombre:");
			String nombre = sc.next();
			System.out.println("Ingrese apellido:");
			String apellido = sc.next();

			Emplyee employee = new Emplyee();
			employee.setMail(email);
			employee.setFirstName(nombre);
			employee.setLastName(apellido);
			employee.setId(id);

			EmployeeDao.modificar(employee, stmt);
		}
	}

	private static void baja(Connection conection, Scanner sc) throws SQLException {
		Statement stmt = conection.createStatement();
		System.out.println("Ingrese id a eliminar:");
		int id = sc.nextInt();
		Emplyee employee = buscar(conection, id);

		EmployeeDao.baja(employee, stmt);

	}

	private static Emplyee buscar(Connection con, int id) throws SQLException {
		Statement stmt = con.createStatement();
		Emplyee emp = EmployeeDao.buscar(stmt, id);
		return emp;
	}

}
