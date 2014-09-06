package com.java.action;



import com.opensymphony.xwork2.ActionSupport;
import com.java.dao.PatientRecord;

import com.java.dao.Insert;

import java.sql.Time;
import java.sql.Timestamp;
import com.opensymphony.xwork2.ActionSupport;

public class SaveAction extends ActionSupport
{
	//private Insert insert ;
//	private PatientRecord record;
 //   PatientRecordDAO dao = new PatientRecordDAO();
	//String record2 = null;
	private String patientname;
	private int age;
	private String complaints;
	
	
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	
	public String SaveDetails()
	{
		
		PatientRecord record = new PatientRecord(patientname, age, complaints);
		
		Insert insert = new Insert();
		//System.out.println("********"+record.getPatientname());
		   insert.Store(record);
		   return "success";
	}
	
}