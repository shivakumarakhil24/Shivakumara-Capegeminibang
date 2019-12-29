package com.capgemini.universityadmission.repository;

import java.util.LinkedHashSet;
import java.util.Set;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.Participant;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;

public class Repository {

	public static LinkedHashSet<Application> applications = new LinkedHashSet<>();
	public static LinkedHashSet<Participant> participants = new LinkedHashSet<>();
	public static LinkedHashSet<ProgramsOffered> programsOffereds = new LinkedHashSet<>();
	public static LinkedHashSet<ProgramsScheduled> programsScheduleds = new LinkedHashSet<>();
	public static LinkedHashSet<Users> users = new LinkedHashSet<>();

	static {
		Users user = new Users();
		user.setLoginId("admin");
		user.setPassword("admin");
		user.setRole("Admin");
		users.add(user);

		Users user1 = new Users();
		user1.setLoginId("mac");
		user1.setPassword("mac");
		user1.setRole("MAC");
		users.add(user1);
		
		ProgramsOffered pogoff = new ProgramsOffered();
		pogoff.setCollegeID(1);
		pogoff.setDegreeCertificateOffered("Engineering");
		pogoff.setProgramName("ECE");
		pogoff.setDescription("This is for electronics and communication branch");
		pogoff.setDuration("4 years");
		pogoff.setApplicantEligibility(75.5);
		programsOffereds.add(pogoff);
		
		ProgramsOffered pogoff2 = new ProgramsOffered();
		pogoff2.setCollegeID(2);
		pogoff2.setDegreeCertificateOffered("Engineering");
		pogoff2.setProgramName("CSE");
		pogoff2.setDescription("This is for Computer Science engineering branch");
		pogoff2.setDuration("4 years");
		pogoff2.setApplicantEligibility(70.5);
		programsOffereds.add(pogoff2);
	}
}

