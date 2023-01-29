package co.edureka.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
	private static SessionFactory sfactory=null;
	
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); //XML Parsing
		
		if(sfactory == null) {
			sfactory = config.buildSessionFactory();
		}
		
		return sfactory;
	}
}
