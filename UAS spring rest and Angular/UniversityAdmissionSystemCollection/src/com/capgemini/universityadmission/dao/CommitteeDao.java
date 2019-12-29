package com.capgemini.universityadmission.dao;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;

public interface CommitteeDao {

	public boolean login(String loginId, String password,String role);
	public LinkedHashSet<Application> viewAllApplications(String scheduledProgramId);
	public Application viewParticualrApplication(int applicationId);
	/*public boolean accept(int applicationId);
	public boolean confirm(int applicationId);
	public boolean reject(int applicationId);*/
}
