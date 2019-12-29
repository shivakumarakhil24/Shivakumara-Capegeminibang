package com.capgemini.universityadmission.services;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;

public interface ApplicantService {

	public LinkedHashSet<ProgramsOffered> viewAllPrograms() ;
	public String viewStatus(int applicationId);
	public int apply(Application application);
}
