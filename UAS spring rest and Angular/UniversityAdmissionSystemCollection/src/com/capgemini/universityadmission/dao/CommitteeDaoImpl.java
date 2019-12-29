package com.capgemini.universityadmission.dao;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.repository.Repository;

public class CommitteeDaoImpl implements CommitteeDao{

	private LinkedHashSet<Users> users = Repository.users;
	private LinkedHashSet<Application> applications = Repository.applications;
	@Override
	public boolean login(String loginId, String password,String role) {
		boolean logged = false;
		for (Users user : users) {
			if(user.getLoginId().equals(loginId) && user.getPassword().equals(password) && user.getRole().equalsIgnoreCase("mac")) {
				logged = true;
			}
		}
		return logged;
	}

	@Override
	public LinkedHashSet<Application> viewAllApplications(String scheduledProgramId) {
		return applications;
	}

	@Override
	public Application viewParticualrApplication(int applicationId) {
		Iterator it = applications.iterator();
		while(it.hasNext()) {
			Application application = (Application)it.next();
			if(application.getApplicationId()==applicationId) {
				return application;
			}
		}
		return null;
	}
/*	@Override
	public boolean accept(int applicationId) {
		boolean accepted = false;
		for (Application application : applications) {
			if(application.getApplicationId() == applicationId) {
				application.setStatus("accepted");
				accepted = true;
			}
		}
		return accepted;
	}

	@Override
	public boolean confirm(int applicationId) {
		boolean confirmed = false;
		for (Application application : applications) {
			if(application.getApplicationId() == applicationId && application.getStatus().equals("accepted") ) {
				application.setStatus("confirmed");
				confirmed = true;
			}
		}
		return confirmed;
	}

	@Override
	public boolean reject(int applicationId) {
		boolean rejected = false;
		for (Application application : applications) {
			if(application.getApplicationId() == applicationId) {
				application.setStatus("rejected");
				rejected = true;
			}
		}
		return rejected;
	}*/

}
