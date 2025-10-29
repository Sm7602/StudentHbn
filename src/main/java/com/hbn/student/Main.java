package com.hbn.student;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hbn.student.entity.Student;

public class Main {

	public static void main(String[] arg) {
		Student s=new Student("vikas","sydgy@jfhuauh",23);
		
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(s);
		tx.commit();
	}
}
