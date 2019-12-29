package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.dao.AdminDao;
import com.capgemini.universityadmission.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {

	AdminDao dao = new AdminDaoImpl();

	@Override
	public boolean login(String loginId, String password,String role) {
		return dao.login(loginId, password,role);
	}

	@Override
	public boolean addProgramsOffered(ProgramsOffered program) {
		return dao.addProgramsOffered(program);
	}

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
	public boolean deleteProgramsScheduled(String scheduledProgramId) {

		return dao.deleteProgramsScheduled(scheduledProgramId);
	}

	@Override
	public LinkedHashSet<Application> viewAllAcceptedApplications(String status) {

		return dao.viewAllAcceptedApplications(status);
	}

	@Override
	public LinkedHashSet<Application> viewAllConfirmedApplications(String status) {
		return dao.viewAllConfirmedApplications(status);
	}

	@Override
	public LinkedHashSet<Application> viewAllRejectedApplications(String status) {
		return dao.viewAllRejectedApplications(status);
	}

	@Override
	public LinkedHashSet<ProgramsScheduled> viewAllScheduledPrograms(String startDate, String endDate) {
		return dao.viewAllScheduledPrograms(startDate, endDate);
	}

	
}
