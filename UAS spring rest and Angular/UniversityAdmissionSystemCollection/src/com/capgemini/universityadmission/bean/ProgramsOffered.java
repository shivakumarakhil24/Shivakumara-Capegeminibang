package com.capgemini.universityadmission.bean;

public class ProgramsOffered {
	private int collegeID;
	private String programName;
	private String description;
	private double applicantEligibility;
	private String duration;
	private String degreeCertificateOffered;
	
	
	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
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

	public double getApplicantEligibility() {
		return applicantEligibility;
	}

	public void setApplicantEligibility(double applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", description=" + description
				+ ", applicantEligibility=" + applicantEligibility + ", duration=" + duration
				+ ", degreeCertificateOffered=" + degreeCertificateOffered + "]";
	}

}
