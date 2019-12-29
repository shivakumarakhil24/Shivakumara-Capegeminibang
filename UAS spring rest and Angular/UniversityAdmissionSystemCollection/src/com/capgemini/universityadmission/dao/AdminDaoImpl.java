package com.capgemini.universityadmission.dao;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.repository.Repository;

public class AdminDaoImpl implements AdminDao{
	
	private LinkedHashSet<Users> users = Repository.users;
	private LinkedHashSet<ProgramsOffered> programsOffereds = Repository.programsOffereds;
	private LinkedHashSet<ProgramsScheduled> programsScheduleds = Repository.programsScheduleds;
	private LinkedHashSet<Application> applications = Repository.applications;

	@Override
	public boolean login(String loginId, String password,String role) {
		boolean logged = false;
		for (Users user : users) {
			if(user.getLoginId().equals(loginId) && user.getPassword().equals(password) && user.getRole().equalsIgnoreCase("admin")) {
				logged = true;
			}
		}
		return logged;
	}

	@Override
	public boolean addProgramsOffered(ProgramsOffered program) {
		boolean addedProgram= false;
		if(!programsOffereds.contains(program)) {
			programsOffereds.add(program);
			addedProgram = true;
		}
		return addedProgram;
	}

	@Override
	public boolean updateProgramsOffered(ProgramsOffered program) {
		boolean updatedProgram= false;
		for (ProgramsOffered program1 : programsOffereds) {
			if(program1.getProgramName().equals(program.getProgramName())) {
				programsOffereds.remove(program1);
				programsOffereds.add(program);
				updatedProgram = true;
			}
		}
		return updatedProgram;
	}

	@Override
	public boolean deleteProgramsOffered(String programName) {
		boolean deletedProgram = false;
		for (ProgramsOffered programsOffered : programsOffereds) {
			if(programsOffered.getProgramName().equals(programName)) {
				programsOffereds.remove(programsOffered);
				deletedProgram = true;
			}
		}
		return deletedProgram;
	}

	@Override
	public boolean addProgramsScheduled(ProgramsScheduled program) {
		boolean addedProgram= false;
		if(!programsScheduleds.contains(program)) {
			programsScheduleds.add(program);
			addedProgram = true;
		}
		return addedProgram;
	}

	@Override
	public boolean updateProgramsScheduled(ProgramsScheduled program) {
		boolean updatedProgram= false;
		for (ProgramsScheduled program1 : programsScheduleds) {
			if(program1.getProgramName().equals(program.getProgramName())) {
				programsScheduleds.remove(program1);
				programsScheduleds.add(program);
				updatedProgram = true;
			}
		}
		return updatedProgram;
	}

	@Override
	public boolean deleteProgramsScheduled(String scheduledProgramId) {
		boolean deletedProgram = false;
		for (ProgramsScheduled programsScheduled : programsScheduleds) {
			if (programsScheduled.getScheduledProgramId() == scheduledProgramId) {
				programsScheduleds.remove(programsScheduled);
				deletedProgram = true;
			}
		}
		return deletedProgram;
	}

	@Override
	public LinkedHashSet<Application> viewAllAcceptedApplications(String status) {
		LinkedHashSet<Application> acceptedApplications = new LinkedHashSet<Application>();
		for (Application application : applications) {
			if(application.getStatus().equals("accepted")) {
				acceptedApplications.add(application);
			}
		}
		return acceptedApplications;
	}

	@Override
	public LinkedHashSet<Application> viewAllConfirmedApplications(String status) {
		LinkedHashSet<Application> confirmedApplications = new LinkedHashSet<Application>();
		for (Application application : applications) {
			if(application.getStatus().equals("confirmed")) {
				confirmedApplications.add(application);
			}
		}
		return confirmedApplications;
	}

	@Override
	public LinkedHashSet<Application> viewAllRejectedApplications(String status) {
		LinkedHashSet<Application> rejectedApplications = new LinkedHashSet<Application>();
		for (Application application : applications) {
			if(application.getStatus().equals("rejected")) {
				rejectedApplications.add(application);
			}
		}
		return rejectedApplications;
	}

	@Override
	public LinkedHashSet<ProgramsScheduled> viewAllScheduledPrograms(String startDate, String endDate) {
		LinkedHashSet<ProgramsScheduled> scheduledPrograms  = new LinkedHashSet<ProgramsScheduled>();
		for (ProgramsScheduled programsScheduled : programsScheduleds) {
			if (programsScheduled.getStartDate().equals(startDate) && programsScheduled.equals(endDate)) {
				scheduledPrograms.add(programsScheduled);
			}
		}
		return scheduledPrograms;
	}

}
