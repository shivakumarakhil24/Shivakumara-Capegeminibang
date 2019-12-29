
package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;
import java.util.List;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Participant;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;

public interface AdminService {

	public Users adminLogin(Integer adminId, String adminPassword);

	public boolean addProgramsOffered(ProgramsOffered programsOffered);

	public boolean updateProgramsOffered(ProgramsOffered program);

	public boolean deleteProgramsOffered(String programName);

	public boolean addProgramsScheduled(ProgramsScheduled program);

	public boolean updateProgramsScheduled(ProgramsScheduled program);

	public boolean deleteProgramsScheduled(int scheduledProgramId);

	public List<Application> viewAllAcceptedApplications();

	public List<Application> viewAllConfirmedApplications();

	public List<Application> viewAllRejectedApplications();

}
