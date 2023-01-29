package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.update(st);
		*/
		
		Student st = session.get(Student.class, 112);
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Pankaj Kumar"); //dirty object
		}
		else
			System.out.println("no matching student found!!");
		
		
		tx.commit();
		session.close();
		sfactory.close();

	}

}
