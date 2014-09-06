package com.java.dao;

import java.util.List;
import java.sql.ResultSet;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.cfg.AnnotationConfiguration;
import java.sql.SQLException;

import java.sql.Timestamp;


public class PatientRecordDAO {
	 
	SessionFactory session = new AnnotationConfiguration().configure().addAnnotatedClass(PatientRecord.class).buildSessionFactory();
	Session session1 = session.openSession();
	Transaction trans = session1.beginTransaction();
	
	public List<PatientRecord> getdetails()
	{
		Criteria cr = session1.createCriteria(PatientRecord.class);
		return cr.list();
	}
	
}
