package com.boom.kaka.dao;

import com.boom.kaka.model.Patient_msg;

import java.util.List;


/*

 * */
public interface PatientMsgDao {

	public List<Patient_msg> findAllMsg();

	public List<Patient_msg> findMsgById(Integer pid);
	
	public List<Patient_msg> findCurrentState();
}
