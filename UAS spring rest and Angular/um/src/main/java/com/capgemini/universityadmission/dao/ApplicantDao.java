package com.capgemini.universityadmission.dao;


import java.util.List;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;



public interface ApplicantDao {
	public List<ProgramsOffered> viewAllPrograms();

	public boolean apply(Application application);

	public List<String> viewStatus(int applicationId);
}

