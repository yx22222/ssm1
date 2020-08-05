package com.boom.kaka.service.user.impl;

import java.util.List;

import com.boom.kaka.dao.PatientDao;
import com.boom.kaka.model.Patient;
import com.boom.kaka.model.QueryVo;
import com.boom.kaka.service.user.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;
	
	@Override
	public List<Patient> findAllPatient() {
		// TODO Auto-generated method stub
		return patientDao.findAllPatient();
	}

	@Override
	public Patient findPatientById(Integer pid) {
		// TODO Auto-generated method stub
		return patientDao.findPatientById(pid);
	}

	@Override
	public Patient isExists(QueryVo vo) {
		// TODO Auto-generated method stub
		if(vo.getPusername().trim() == null || vo.getPpsd().trim() == null) {
			return null;
		} else {
			return patientDao.findByLoginMsg(vo);
		}
	}

}
