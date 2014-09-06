package com.java.dao;

import java.util.List;
import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.cfg.AnnotationConfiguration;

public class Insert {
	SessionFactory factory = new AnnotationConfiguration().configure().addAnnotatedClass(PatientRecord.class).buildSessionFactory();
	Session session = factory.openSession();
	Transaction trans = session.beginTransaction();
	
	public String Store(PatientRecord record)
	{
	
	//	record = new PatientRecord();
		
	//	record.setSno(+record.getSno());
	//	record.setPatientname("name" +record.getPatientname());
	//	record.setAge(+record.getAge());
	//	record.setComplaints("complaints" +record.getComplaints());
		//session1.persist(record);
		session.save(record);
		
		trans.commit();
		session.close();
		return "success";
	}

}
