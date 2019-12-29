package com.capgemini.universityadmission.services;



import java.util.List;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Users;


public interface CommitteeService {
	public Users login(Users users);

	public List<Application> viewAllApplications();
	
	public boolean acceptRejectConfirm(int applicationId, String status);

	/*
	 * public boolean accept(int applicationId);
	 * 
	 * public boolean confirm(int applicationId);
	 * 
	 * public boolean reject(int applicationId);
	 */


}

