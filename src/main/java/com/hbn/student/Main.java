package com.hbn.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hbn.student.configuration.HibernateConfiguration;
import com.hbn.student.entity.Student;

public class Main {

	public static void main(String[] arg) {
		Student s=new Student();
		
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf=meta.buildSessionFactory();
//		Session session=sf.openSession();
		 
//		SessionFactory sf= HibernateConfiguration.getSessionFactory();
//		Session session=sf.openSession();
		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		s=session.get(Student.class, 2);
//		session.load(s, 3);
		
		System.out.println(s);
		
//		session.persist(s);
//		tx.commit();
	}
}
