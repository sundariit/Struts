package com.java.action;

import java.sql.Timestamp;
import java.util.List;
import java.sql.SQLException;
import com.java.dao.PatientRecord;
import com.java.dao.PatientRecordDAO;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;

public class PatientRecordAction {

	PatientRecord record = new PatientRecord();
	List<PatientRecord> list = new ArrayList<PatientRecord>();
	PatientRecordDAO dao = new PatientRecordDAO();
	
	public PatientRecord getRecord() {
		return record;
	}
	public void setRecord(PatientRecord record) {
		this.record = record;
	}
	public List<PatientRecord> getList() {
		return list;
	}
	public void setList(List<PatientRecord> list) {
		this.list = list;
	}
	public PatientRecordDAO getDao() {
		return dao;
	}
	public void setDao(PatientRecordDAO dao) {
		this.dao = dao;
	}
	public String listdetails()
	{
		list = dao.getdetails();
		return "success";
	}
	
}
