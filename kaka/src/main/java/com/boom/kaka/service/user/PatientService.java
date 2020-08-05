package com.boom.kaka.service.user;

import com.boom.kaka.model.Patient;
import com.boom.kaka.model.QueryVo;
import java.util.List;



public interface PatientService {

	public List<Patient> findAllPatient();
		

	public Patient findPatientById(Integer pid);
	

	public Patient isExists(QueryVo vo);
}
