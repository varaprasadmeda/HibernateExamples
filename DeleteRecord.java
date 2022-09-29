package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		System.out.println("Hibernate Example for Retrieving...");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
        Employee emp = new Employee();
        emp.setEmpId(4);
		
		session.delete(emp);
		tx.commit();
		session.close();
		
		
		
		

	}

}
