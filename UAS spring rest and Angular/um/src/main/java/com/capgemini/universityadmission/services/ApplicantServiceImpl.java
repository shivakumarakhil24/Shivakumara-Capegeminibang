package com.capgemini.universityadmission.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.dao.ApplicantDao;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	@Autowired
	private ApplicantDao dao;
	
	@Override
	public List<ProgramsOffered> viewAllPrograms() {
		return dao.viewAllPrograms();
	}

	@Override
	public List<String> viewStatus(int applicationId) {
		return dao.viewStatus(applicationId);
	}

	@Override
	public boolean apply(Application application) {
		return dao.apply(application);
	}

}
