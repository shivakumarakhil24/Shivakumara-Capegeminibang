package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;

public interface AdminService {
	
	public boolean login(String loginId,String password,String role);
	
	public boolean addProgramsOffered(ProgramsOffered program);
	public boolean updateProgramsOffered(ProgramsOffered program);
	public boolean deleteProgramsOffered(String programName);
	
	public boolean addProgramsScheduled(ProgramsScheduled program);
	public boolean updateProgramsScheduled(ProgramsScheduled program);
	public boolean deleteProgramsScheduled(String scheduledProgramId);
	
	public LinkedHashSet<Application> viewAllAcceptedApplications(String status);
	public LinkedHashSet<Application> viewAllConfirmedApplications(String status);
	public LinkedHashSet<Application> viewAllRejectedApplications(String status);
	
	public LinkedHashSet<ProgramsScheduled> viewAllScheduledPrograms(String startDate,  String endDate);

}
