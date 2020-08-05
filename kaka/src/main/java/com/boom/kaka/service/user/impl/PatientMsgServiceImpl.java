package com.boom.kaka.service.user.impl;

import java.util.List;

import com.boom.kaka.dao.PatientMsgDao;
import com.boom.kaka.model.Patient_msg;
import com.boom.kaka.service.user.PatientMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientMsgServiceImpl implements PatientMsgService {

	@Autowired
	private PatientMsgDao patientMsgDao;
	
	@Override
	public List<Patient_msg> findAllMsg() {
		// TODO Auto-generated method stub
		return patientMsgDao.findAllMsg();
	}

	@Override
	public List<Patient_msg> findMsgById(Integer pid) {
		// TODO Auto-generated method stub
		return patientMsgDao.findMsgById(pid);
	}

	@Override
	public List<Patient_msg> findCurrentState() {
		// TODO Auto-generated method stub
		return patientMsgDao.findCurrentState();
	}

}
