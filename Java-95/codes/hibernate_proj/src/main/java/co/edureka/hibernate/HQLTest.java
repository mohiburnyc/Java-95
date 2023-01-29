package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws Exception {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Bhanu'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		String hql = "from co.edureka.hibernate.entity.Student where studentId IN (102, 104, 18, 205, 110)";
		
		Query<Student> query = session.createQuery(hql);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters
		Query<Student> query = session.createQuery(hql);
		query.setParameter(0, 101);
		query.setParameter(1, 106);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 106);
		query.setParameter("maxsid", 200);
		
		List<Student> students = query.getResultList();
		
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		*/
		
		//-- DML operations with HQL
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Sunil Joseph' where studentId=101";
		Query q = session.createQuery(hql);
		
		session.beginTransaction();
		int rowsAffected = q.executeUpdate();
		System.out.println("employees updated = " + rowsAffected);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
