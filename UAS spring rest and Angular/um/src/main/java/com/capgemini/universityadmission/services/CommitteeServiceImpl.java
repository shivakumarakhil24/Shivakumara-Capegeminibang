package com.capgemini.universityadmission.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.dao.CommitteeDao;

@Service
public class CommitteeServiceImpl implements CommitteeService {

	@Autowired
	private CommitteeDao dao;
	
	@Override
	public Users login(Users users) {
		return dao.login(users);
	}

	@Override
	public List<Application> viewAllApplications() {
		return dao.viewAllApplications();
	}

	@Override
	public boolean acceptRejectConfirm(int applicationId, String status) {
		return dao.acceptRejectConfirm(applicationId, status);
	}
	
	

	/*
	 * @Override public boolean accept(int applicationId) { // return dao.accept;
	 * return false; }
	 * 
	 * @Override public boolean confirm(int applicationId) { return false; }
	 * 
	 * @Override public boolean reject(int applicationId) { return false; }
	 */

}
