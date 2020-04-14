package ejercicioHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class SalarioDao {

	//insertar

		public static void insertSalario(SalarioMap salario) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(salario);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
		}
		
		
		//listar

		public List<SalarioMap> getAllSalario() {
			Session sesn = HibernateUtil.getSessionFactory().openSession();
			List<SalarioMap> salario = new ArrayList<SalarioMap>();
			Query query=sesn.createQuery("From SalarioMap");
			salario= query.list();
			HibernateUtil.shutdown();
			return salario;
		}
		
		
		public static SalarioMap getSalario(int id) {
			Session sesn = HibernateUtil.getSessionFactory().openSession();
			Query query=sesn.createQuery("From SalarioMap where id=" + id);
			SalarioMap salario = (SalarioMap) query.uniqueResult();
			HibernateUtil.shutdown();
			return salario;
		}

	
}
