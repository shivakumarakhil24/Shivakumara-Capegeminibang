package com.capgemini.student.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_info")
public class StudentBean {
	@Id
	@Column(name="sd_id")
	private int sd_id;
	@Column(name="sd_name")
	private String sd_name;
	@Column
	private String college;
	@Column
	private String branch;
	@Column
	private int sem;
	
	
	//getter and setters
	public int getSd_id() {
		return sd_id;
	}
	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}
	public String getSd_name() {
		return sd_name;
	}
	public void setSd_name(String sd_name) {
		this.sd_name = sd_name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	
	
	

}
