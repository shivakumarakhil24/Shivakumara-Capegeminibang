package com.capgemini.universityadmission.dao;

import java.util.List;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Users;

public interface CommitteeDao {

	public Users login(Users user);

	public List<Application> viewAllApplications();

	public Application viewParticualrApplication(int applicationId);

	public boolean acceptRejectConfirm(int applicationId, String status);

	/*
	 * public boolean confirm(int applicationId);
	 * 
	 * public boolean reject(int applicationId);
	 */
}
