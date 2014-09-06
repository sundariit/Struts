package com.java.action;

import java.sql.Timestamp;
import java.util.List;
import java.sql.SQLException;
import com.java.dao.PatientRecord;
import com.opensymphony.xwork2.ActionSupport;
import com.java.dao.PatientRecordDAO;

import java.util.ArrayList;

public class NewAction {

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
	public String execute()
	{
		return "success";
	}
	
}
