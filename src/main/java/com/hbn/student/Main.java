package com.hbn.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.student.configuration.HibernateConfiguration;
import com.hbn.student.entity.Address;
import com.hbn.student.entity.Student;

public class Main {

	public static void main(String[] arg) {
		Student s1=new Student("abc","@abc",21);
		Student s2=new Student("def","@def",22);
		Student s3=new Student("ghi","@ghi",23);
		Student s4=new Student("jkl","@jkl",25);
		Address add1=new Address("g noida","up");
		Address add2=new Address("noida","up");
		Address add3=new Address("m","up");
		Address add4=new Address("d","up");
		
		s1.setAddresses(List.of(add1,add2,add3,add4));
		s2.setAddresses(List.of(add1,add2,add3));
		s3.setAddresses(List.of(add1,add2,add4));
		s4.setAddresses(List.of(add1,add3,add4));
		
		add1.setStudent(List.of(s1,s2,s3,s4));
		add2.setStudent(List.of(s1,s3,s4));
		add3.setStudent(List.of(s1,s2,s4));
		add4.setStudent(List.of(s1,s2,s3));
		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(s4);	
       	tx.commit();
		
//		session.load(s1, 1);
//		System.out.println(s1);
//		System.out.println(s1.getAddresses());
//		
//		session.load(add1, 1);
//		System.out.println(add1);
//		System.out.println(add1.getStudent());
		
		
	}
}
