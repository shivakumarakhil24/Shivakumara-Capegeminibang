package com.capgemini.universityadmission.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UniversityResponse {

	private int statusCode;
	private String message;
	private String description;
	private Application applicationBean;
	private List<Application> applicationsList;
	private List<ProgramsOffered> programsOfferedList;
	private List<UniversityResponse> universityResponses;
	private Users users;
	
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<UniversityResponse> getUniversityResponses() {
		return universityResponses;
	}

	public void setUniversityResponses(List<UniversityResponse> universityResponses) {
		this.universityResponses = universityResponses;
	}

	private ProgramsScheduled programsScheduled;
	


	public ProgramsScheduled getProgramsScheduled() {
		return programsScheduled;
	}

	public void setProgramsScheduled(ProgramsScheduled programsScheduled) {
		this.programsScheduled = programsScheduled;
	}

	private List<String> status;
	

	// Getter and Setter
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Application getApplicationBean() {
		return applicationBean;
	}

	public void setApplicationBean(Application applicationBean) {
		this.applicationBean = applicationBean;
	}

	public List<Application> getApplicationsList() {
		return applicationsList;
	}

	public void setApplicationsList(List<Application> applList) {
		this.applicationsList = applList;
	}

	public List<ProgramsOffered> getProgramsOfferedList() {
		return programsOfferedList;
	}

	public void setProgramsOfferedList(List<ProgramsOffered> programsOfferedList) {
		this.programsOfferedList = programsOfferedList;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

	

	
}
