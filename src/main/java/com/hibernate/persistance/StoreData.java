package com.hibernate.persistance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure(); 
		//we can aslo declare as cfg.configure("hibernate.hbm.xml") 
		//as there is only one configuration file
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setFirstName("Rajashekar");
		e1.setLastName("Nampelli");

		session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}