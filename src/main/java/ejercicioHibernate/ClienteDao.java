package ejercicioHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ClienteDao {
	
	
	//insertar

	public void insertCliente(ClienteEntity cli) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(cli);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
	
	
	//listar

	public List<ClienteEntity> getAllClientes() {
		Session sesn = HibernateUtil.getSessionFactory().openSession();
		List<ClienteEntity> cliente = new ArrayList<ClienteEntity>();
		try {
			cliente = sesn.createQuery("From EmployeeEntity").list();
			for (ClienteEntity cli : cliente) {
				System.out.println(cli.getFirstName() + " " + cli.getLastName() + " " + cli.getEmail());
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sesn.close();
		}

		HibernateUtil.shutdown();
		return cliente;
	}
	
	//eliminar

	public void deleteCliente(ClienteEntity cli) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(cli);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
