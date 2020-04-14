package ejercicioHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import ejercicio9.jdbc.Emplyee;


public class ClienteDao {
	
	
	//insertar

	public static void insertCliente(ClienteEntity cli) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(cli);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
	
	
	//listar

	public List<ClienteEntity> getAllCliente() {
		Session sesn = HibernateUtil.getSessionFactory().openSession();
		List<ClienteEntity> cliente = new ArrayList<ClienteEntity>();
		try {
			cliente = sesn.createQuery("From ClienteEntity").list();
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

	public static void  deleteCliente(ClienteEntity cli) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(cli);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}


	public static ClienteEntity getCliente(int id) {
		Session sesn = HibernateUtil.getSessionFactory().openSession();
		Query query=sesn.createQuery("From ClienteEntity where id=" + id);
		ClienteEntity cli = (ClienteEntity) query.uniqueResult();
		HibernateUtil.shutdown();
		return cli;
		
	}


}
