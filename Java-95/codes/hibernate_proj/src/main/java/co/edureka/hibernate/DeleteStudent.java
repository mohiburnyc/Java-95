package co.edureka.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.delete(st);
		*/
		
		Student st = session.get(Student.class, 112);
		if(st != null) {
			System.out.println(st);
			
			System.out.print("\ndo you want to delete the student [Y/N]: ");
			Scanner sc = new Scanner(System.in);
			
			if(sc.next().equalsIgnoreCase("Y"))
				session.delete(st);
		}
		else
			System.out.println("no matching student found!!");
		
		
		tx.commit();
		session.close();
		sfactory.close();
	}

}
