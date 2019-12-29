package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Participant;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.dao.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired(required = true)
	private AdminDAO dao;

	@Override
	public boolean updateProgramsOffered(ProgramsOffered program) {
		return dao.updateProgramsOffered(program);
	}

	@Override
	public boolean deleteProgramsOffered(String programName) {
		return dao.deleteProgramsOffered(programName);
	}

	@Override
	public boolean addProgramsScheduled(ProgramsScheduled program) {
		return dao.addProgramsScheduled(program);
	}

	@Override
	public boolean updateProgramsScheduled(ProgramsScheduled program) {
		return dao.updateProgramsScheduled(program);
	}

	@Override
	public boolean deleteProgramsScheduled(int scheduledProgramId) {
		return dao.deleteProgramsScheduled(scheduledProgramId);
	}

	@Override
	public List<Application> viewAllAcceptedApplications() {
		return dao.viewAllAcceptedApplications();
	}

	@Override
	public List<Application> viewAllConfirmedApplications() {
		return dao.viewAllConfirmedApplications();
	}

	@Override
	public List<Application> viewAllRejectedApplications() {
		return dao.viewAllRejectedApplications();
	}

	@Override
	public Users adminLogin(Integer adminId, String adminPassword) {
		return dao.adminLogin(adminId, adminPassword);
	}

	@Override
	public boolean addProgramsOffered(ProgramsOffered program) {
		return dao.addProgramsOffered(program);
	}


}
