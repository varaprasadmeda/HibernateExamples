package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

	public static void main(String[] args) {
		System.out.println("Hibernate Example");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setName("Kumar");
		emp.setEmpSalary(20000);
		emp.setEmpAddress("Hyd");
		
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		
		System.out.println("Employee Record has been updated successfully");
		
		tx.commit();
		session.close();
		factory.close();
				

	}

}
