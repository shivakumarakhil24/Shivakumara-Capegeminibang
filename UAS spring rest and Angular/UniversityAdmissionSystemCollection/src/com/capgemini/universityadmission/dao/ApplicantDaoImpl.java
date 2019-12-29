package com.capgemini.universityadmission.dao;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.repository.Repository;

public class ApplicantDaoImpl implements ApplicantDao {
	
	private LinkedHashSet<ProgramsOffered> programs = Repository.programsOffereds;
	private LinkedHashSet<Application> applications = Repository.applications;
	
	@Override
	public LinkedHashSet<ProgramsOffered> viewAllPrograms() {
		return programs;
	}

	@Override
	public int apply(Application application) {
		int id;
		if(applications.isEmpty()) {
			application.setApplicationId(1);
			id=1;
		}
		else {
			application.setApplicationId(applications.size()+1);
			id=applications.size()+1;
		}
		applications.add(application);
		return id;
	}

	@Override
	public String viewStatus(int applicationId) {
		String viewedStatus = null;
		for (Application application : applications) {
			if(application.getApplicationId() == applicationId){
				viewedStatus = application.getStatus();
			}
		}
		return viewedStatus;
	}

}
