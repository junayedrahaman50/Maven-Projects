package com.hibernate.app.config;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.app.entity.Admin;
import com.hibernate.app.entity.Passenger;
import com.hibernate.app.entity.User;

public class HibernateUtil {
	//reference variable of session factory interface

	private static SessionFactory sessionFactory;
	
	//method of return type SessionFactory used for connection
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			//reference variable of Configuration class
			try {
			Configuration configuration = new Configuration();
			//object of properties class
			Properties settings = new Properties();
			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/projects");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			//using thread for concurrent execution
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			//passing settings to set properties
			configuration.setProperties(settings);
			
			configuration.addAnnotatedClass(User.class);
//			configuration.addAnnotatedClass(Admin.class);
			configuration.addAnnotatedClass(Passenger.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			System.out.println("hibernate java config ServiceRegistry created");
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
			}
			catch(HibernateException e) {
				System.out.println(e.getMessage());
			}
		}
		//return sessionFactory
		return sessionFactory;
		
	}
	public static Session getSession() {
		return getSessionFactory().openSession();
		
	}
}
