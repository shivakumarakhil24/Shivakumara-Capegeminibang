package com.capgemini.universityadmission.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="programs_offered")
public class ProgramsOffered {
	
	@Id
	@Column(name="ProgramName")
	private String programName;
	@Column
	private String description;
	@Column(name="applicant_eligibility")
	private String applicantEligibility;
	@Column
	private int duration;
	@Column(name="degree_certificate_offered")
	private String degreeCertificateOffered;
	@Column
	private String images;
	
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplicantEligibility() {
		return applicantEligibility;
	}
	public void setApplicantEligibility(String applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", description=" + description
				+ ", applicantEligibility=" + applicantEligibility + ", duration=" + duration
				+ ", degreeCertificateOffered=" + degreeCertificateOffered + ", images=" + images + "]";
	}
	public void setDuration(int duration2) {
		this.duration = duration2;
	}
	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}
	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	
	
}
