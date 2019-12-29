package com.capgemini.universityadmission.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("applicationBean")
/* @JsonPropertyOrder({"applicationId","name","designation"}) */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@XmlRootElement(name="")
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="application")
public class Application {

	@Id
	@Column(name="application_id")
	private  int applicationId;
	@Column(name="full_name")
	private String fullName;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@Column()
	private String hQualification;
	@Column(name="marks_obtained")
	private double marksObtained;
	@Column
	private String goals;
	@Column(name="email_id")
	private String emailId;
	@Column(name="scheduled_program_id")
	private String scheduledProgramId;
	@Column
	private String status;
	@Column(name="date_of_interview")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfInterview;
	
	//Getter and Setter
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String gethQualification() {
		return hQualification;
	}
	public void sethQualification(String hQualification) {
		this.hQualification = hQualification;
	}
	public double getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(double marksObtained) {
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
	public String getscheduledProgramId() {
		return scheduledProgramId;
	}
	public void setscheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	
	
}