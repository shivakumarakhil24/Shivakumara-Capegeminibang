package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;

public interface CommitteeService {
	public boolean login(String loginId, String password,String role);
	public LinkedHashSet<Application> viewAllApplications(String scheduledProgramId);
	public boolean accept(int applicationId);
	public boolean confirm(int applicationId);
	public boolean reject(int applicationId);

}
