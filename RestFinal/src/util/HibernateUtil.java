package util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
	 private static final SessionFactory sessionFactory;

	    static {
	        try {
	            // Cr�er une SessionFactory � partir de hibernate.cfg.xml
	            sessionFactory = new AnnotationConfiguration().configure("util/hibernate.cfg.xml").buildSessionFactory();
	        }
	        catch (Throwable ex) {
	            System.err.println("Echec cr�ation SessionFactory" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}