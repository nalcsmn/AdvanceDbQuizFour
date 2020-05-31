package Main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


import modelo.Details;

public class dbutil {		
	private static SessionFactory factory;


	public static Session getSession() {
		
				
			factory = new AnnotationConfiguration()
					.configure()
					.addAnnotatedClass(Details.class)
					.buildSessionFactory();

	

		return factory.openSession();
	}
}
