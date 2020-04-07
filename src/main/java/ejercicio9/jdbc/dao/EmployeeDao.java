package ejercicio9.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio9.jdbc.Emplyee;

public class EmployeeDao {

	public static void modificar(Emplyee employee, Statement stmt) throws SQLException {
		String insertSql = "update employee set email = '" + employee.getMail() + "' , first_name ='"
				+ employee.getFirstName() + "' ,last_name='" + employee.getLastName() + "' where id= "
				+ employee.getId();

		stmt.executeUpdate(insertSql);

	}

	public static void baja(Emplyee employee, Statement stmt) throws SQLException {
		
			String deleteSql = "delete from employee where ID=  " + employee.getId();
			stmt.executeUpdate(deleteSql);
		
	}

	public static List<Emplyee> listar(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from employee");
		List<Emplyee> lista = new ArrayList<Emplyee>();
		while (rs.next()) {
			int id = rs.getInt(1);
			String mail = rs.getString(2);
			String name = rs.getString(3);
			String last = rs.getString(4);

			Emplyee empleado = new Emplyee();
			empleado.setId(id);
			empleado.setMail(mail);
			empleado.setFirstName(name);
			empleado.setLastName(last);
			lista.add(empleado);
		}
		return lista;

	}

	public static void insertar(Emplyee emp, Statement stmt) throws SQLException {
		String insertSql = "insert into employee (email, `FIRST_NAME` , `LAST_NAME` ) values " + "('" + emp.getMail()
				+ "'," + "'" + emp.getFirstName() + "', '" + emp.getLastName() + "')";
		stmt.executeUpdate(insertSql);
	}

	public static Emplyee buscar(Statement stmt, int id) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from employee where ID = " + id);
		Emplyee emp = null;
		while (rs.next()) {
			emp = new Emplyee();
			emp.setMail(rs.getString(2));
			emp.setFirstName(rs.getString(3));
			emp.setLastName(rs.getString(4));
		}
		return emp;

	}

}
