package testhibernate.model;



import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction txn = (Transaction) session.beginTransaction();
		session.save(new Persons(103,"kishore","pune","maharastra"));
		txn.commit();
		System.out.println("Record inserted...");
		

	}

}
