package com.capgemini.universityadmission.dao;

import java.util.LinkedHashSet;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;

public interface ApplicantDao {
	public LinkedHashSet<ProgramsOffered> viewAllPrograms();
	public int apply(Application application);
	public String viewStatus(int applicationId);
}
