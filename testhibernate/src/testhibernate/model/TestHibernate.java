package testhibernate.model;



import java.util.List;

import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import examples.Persons;

public class TestHibernate {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction txn = (Transaction) session.beginTransaction();
		session.save(new Persons(103,"kishore","pune","maharastra"));
		List<String> cities = session.createQuery("select c.city from Persons c").list();
		cities.forEach(System.out::println);
	
	//	List<Persons> data = (List<Persons>) session.createQuery("from Persons p where p.city='selam'").list();
	//	System.out.println(data);
		
		
	//	List<Persons> data = session.createQuery("from Persons p where p.city='selam'").setMaxResults(2).list();
	//	System.out.println(data);	
		
		
		
		System.out.println("Persons names in ascending order");
		List names = session.createQuery("select p.name from Persons p order by p.name").list();
		names.forEach(System.out::println);
		
		
		System.out.println("complete details of  Persons  in ascending order of names");
		List<Persons> details = session.createQuery("from Persons p order by p.name").list();
		details.forEach(System.out::println);
		
		String hql = "update Persons set city=:city where pid=1001";
		Query qry = session.createQuery(hql);
		qry.setParameter("city","Warangal");
		int k = qry.executeUpdate();
		System.out.println(k+" Record(s) are updated...");
		
		String h1 = "delete from Persons where pid=:pid";
		Query q1 = session.createQuery(h1);
		q1.setParameter("pid", 1008);
		q1.executeUpdate();
		System.out.println("Record with 1008 id is deleted...");	
		
		txn.commit();
		
		

	}

}
