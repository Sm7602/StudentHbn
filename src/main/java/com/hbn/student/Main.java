package com.hbn.student;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.student.configuration.HibernateConfiguration;
import com.hbn.student.entity.Address;
import com.hbn.student.entity.Student;

public class Main {

	public static void main(String[] arg) {
		Student s=new Student("dhgfdh","@gah",25);
		Address add=new Address("noida","up");
		
		s.setAddress(add);
		add.setStudent(s);
		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(s);
		session.persist(add);
       	tx.commit();
		
//		s=session.get(Student.class, 2);
//		session.load(s, 3);
		
		
	}
}
