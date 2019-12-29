package com.capgemini.universityadmission.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="participant")
public class Participant {
	@Id
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="email_id")
	private String emailId;
	@Column(name="application_id")
	private int applicationId;
	@Column(name="sheduled_program_id")
	private int scheduledProgramId;
	
	//Getter and Setter
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	
}
