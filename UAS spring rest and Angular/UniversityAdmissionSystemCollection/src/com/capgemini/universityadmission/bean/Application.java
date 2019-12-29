package com.capgemini.universityadmission.bean;

public class Application {

	private int applicationId;
	private String fullName;
	private String dateOfBirth;
	private String highestQualification;
	private int marksObtained;
	private String goals;
	private String emailId;
	private String scheduledProgramId;
	private String status;
	private String dateOfInterview;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(String dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth
				+ ", highestQualification=" + highestQualification + ", marksObtained=" + marksObtained + ", goals="
				+ goals + ", emailId=" + emailId + ", scheduledProgramId=" + scheduledProgramId + ", status=" + status
				+ ", dateOfInterview=" + dateOfInterview + "]";
	}

	

}
