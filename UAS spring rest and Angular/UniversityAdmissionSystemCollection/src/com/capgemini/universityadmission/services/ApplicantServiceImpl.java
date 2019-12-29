package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.dao.ApplicantDao;
import com.capgemini.universityadmission.dao.ApplicantDaoImpl;

public class ApplicantServiceImpl implements ApplicantService {
	ApplicantDao dao=new ApplicantDaoImpl();

	@Override
	public LinkedHashSet<ProgramsOffered> viewAllPrograms() {
		 
		return dao.viewAllPrograms();
	}

	@Override
	public String viewStatus(int applicationId) {
		return dao.viewStatus(applicationId);
	}

	@Override
	public int apply(Application application) {
		return dao.apply(application);
	}

}
