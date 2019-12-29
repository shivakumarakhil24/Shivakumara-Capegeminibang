package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.dao.CommitteeDao;
import com.capgemini.universityadmission.dao.CommitteeDaoImpl;

public class CommitteeServiceImpl implements CommitteeService {

	CommitteeDao dao = new CommitteeDaoImpl();

	@Override
	public boolean login(String loginId, String password,String role) {
		return dao.login(loginId, password,role);
	}

	@Override
	public LinkedHashSet<Application> viewAllApplications(String scheduledProgramId) {
		return dao.viewAllApplications(scheduledProgramId);
	}

	@Override
	public boolean accept(int applicationId) {
		return true;
	}

	@Override
	public boolean confirm(int applicationId) {
		return true;
	}

	@Override
	public boolean reject(int applicationId) {
		return true;
	}

	

}
