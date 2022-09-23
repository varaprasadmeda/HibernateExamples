package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClientApp {

	public static void main(String[] args) {

		System.out.println("Hibernate Example");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(6);
		emp.setName("Kiran");
		emp.setEmpSalary(10000.00f);
		emp.setEmpAddress("Califonia");
		
		session.save(emp);
		tx.commit();
		session.clear();
		factory.close();
		System.out.println("Successfully updated record");

	}

}
