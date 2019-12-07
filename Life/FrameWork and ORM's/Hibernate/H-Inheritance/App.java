package com.hibernate.sivareddy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		//vehicle.setId(101);
		
		FourWheeler foreWheeler = new FourWheeler();
		foreWheeler.setLicenseNumber("TN18Z3740");
		foreWheeler.setName("Ford Figo");
		foreWheeler.setSteeringWheel("Wheel");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setName("Yamaha FZ");
		twoWheeler.setLicenseNumber("TN13B5146");
		twoWheeler.setSteeringHandle("Handle bar");
		
		
	
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Vehicle.class).addAnnotatedClass(TwoWheeler.class).addAnnotatedClass(FourWheeler.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(vehicle);
		session.save(foreWheeler);
		session.save(twoWheeler);
		
		transaction.commit();
		session.close();
		
	}

}
