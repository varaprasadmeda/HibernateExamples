package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveData {

	public static void main(String[] args) {
		System.out.println("Hibernate Example");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Employee emp = (Employee) session.get(Employee.class, new Integer(6));
		System.out.println(emp.getEmpId() + " " + emp.getName() + " " + emp.getEmpSalary() + " " + emp.getEmpAddress());
		session.close();
		factory.close();

	}

}
