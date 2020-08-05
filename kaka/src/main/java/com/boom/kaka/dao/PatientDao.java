package com.boom.kaka.dao;

import com.boom.kaka.model.Patient;
import com.boom.kaka.model.QueryVo;

import java.util.List;
public interface PatientDao {

	public List<Patient> findAllPatient();
	

	public Patient findPatientById(Integer pid);
	

	public Patient findByLoginMsg(QueryVo vo);
}
