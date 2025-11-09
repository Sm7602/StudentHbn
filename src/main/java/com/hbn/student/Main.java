package com.hbn.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.student.configuration.HibernateConfiguration;
import com.hbn.student.entity.Address;
import com.hbn.student.entity.Student;

public class Main {

	public static void main(String[] arg) {
		Student s=new Student("d","@gah",25);
		Address add1=new Address("g noida","up");
		Address add2=new Address("noida","up");
		Address add3=new Address("m","up");
		Address add4=new Address("d","up");
		
		s.setAddresses(List.of(add1,add2,add3,add4));
		add1.setStudent(s);
		add2.setStudent(s);
		add3.setStudent(s);
		add4.setStudent(s);
		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(s);
       	tx.commit();
		
//		session.load(s, 1);
//		System.out.println(s);
//		System.out.println(s.getAddresses());
//		
//		session.load(add, 3);
//		System.out.println(add);
//		System.out.println(add.getStudent());
		
		
	}
}
