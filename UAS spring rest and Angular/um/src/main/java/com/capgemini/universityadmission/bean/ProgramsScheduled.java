package com.capgemini.universityadmission.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="programs_scheduled")
public class ProgramsScheduled {
	
	@Id
	@Column(name="scheduled_program_id")
	private int scheduledProgramId;
	@Column
	private String programName;
	@Column(name="location")
	private String location;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	@Column(name="session_per_week")
	private int sessionPerWeek;
	
	
	//Getter and setter
	public int getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getSessionPerWeek() {
		return sessionPerWeek;
	}
	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}

	

}
