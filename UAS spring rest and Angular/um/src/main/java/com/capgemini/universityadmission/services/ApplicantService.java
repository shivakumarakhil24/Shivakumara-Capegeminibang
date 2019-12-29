package com.capgemini.universityadmission.services;


import java.util.List;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;


public interface ApplicantService {

	public List<ProgramsOffered> viewAllPrograms();

	public List<String> viewStatus(int applicationId);

	public boolean apply(Application application);
}

