package ejercicio9.jdbc.dao;

import java.sql.SQLException;
import java.sql.Statement;
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
		if (employee == null) {

			System.out.println("No existe el id");
		} else {
			String insertSql = "delete from employee where ID=  " + employee.getId();
			stmt.executeUpdate(insertSql);
		}
	}

	public static List<Emplyee> listar(Statement stmt) {
		return null;
		
	}

	
	
	
	

}
