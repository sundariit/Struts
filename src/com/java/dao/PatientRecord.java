package com.java.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import com.opensymphony.xwork2.conversion.annotations.*;



@Entity
@Table (name = "PatientRecord")
public class PatientRecord {
	
	private int Sno;
	private String patientname;
	private int age;
	private String complaints;
	
	
	public PatientRecord(String patientname, int age ,String complaints){
		this.patientname = patientname;
		this.age = age;
		this.complaints = complaints;
		
	}
	
	public PatientRecord()
	{
		
	}
	
	@Id
	@GeneratedValue
	@Column (name = "Sno")
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	
	@Column (name = "patientname", nullable = true)
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	
	@Column (name = "age", nullable = true)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column (name = "complaints", nullable = true)
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	
	
	
}
