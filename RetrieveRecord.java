package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrieveRecord {

	public static void main(String[] args) {
		System.out.println("Hibernate Example for Retrieving...");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//Employee emp = (Employee)session.get(Employee.class, 10); //Get Method
		Employee emp = (Employee)session.load(Employee.class, 10); //load Method
		
		System.out.println("Employee Details......");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmpAddress());
		System.out.println(emp.getEmpSalary());
		
		session.close();
		factory.close();

	}

}
