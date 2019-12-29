package com.capgemini.universityadmission.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.dao.AdminDaoImpl;
import com.capgemini.universityadmission.dao.ApplicantDaoImpl;
import com.capgemini.universityadmission.repository.Repository;
import com.capgemini.universityadmission.services.AdminService;
import com.capgemini.universityadmission.services.AdminServiceImpl;
import com.capgemini.universityadmission.services.ApplicantService;
import com.capgemini.universityadmission.services.ApplicantServiceImpl;
import com.capgemini.universityadmission.services.CommitteeService;
import com.capgemini.universityadmission.services.CommitteeServiceImpl;

public class App {
	private static final String ProgramsOffered = null;
	private static Scanner sc = new Scanner(System.in);
	private static AdminService adminService = new AdminServiceImpl();
	private static ApplicantService applicantService = new ApplicantServiceImpl();
	private static CommitteeService committeeService = new CommitteeServiceImpl();

	public static void main(String[] args) {
		// Repository repository = new Repository();
		ApplicantDaoImpl appManager = new ApplicantDaoImpl();

		System.out.println("Welcome to University Admission");
		// System.out.println("Enter Login detail");

		// adminService.login(sc.next(), sc.next());

		System.out.println("************************************");
		int loginChoice;
		do {
			System.out.println("Select Type of Login");
			System.out.println("1.Users");
			System.out.println("2.Applicant");
			System.out.println("0.Exit");
			System.out.print("Enter your choice: ");
			loginChoice = sc.nextInt();
			System.out.println();

			switch (loginChoice) {
			case 1:
				Users user = new Users();
				System.out.println("Enter the user ID : ");
				String loginID = sc.next();
				sc.nextLine();
				System.out.println("Enter the login password");
				String password = sc.next();
				sc.nextLine();
				System.out.println("Enter the role");
				String role =sc.nextLine();
				boolean adminLoggedIn1 = adminService.login(loginID, password, role);
				boolean macLoggedIn1 = committeeService.login(loginID, password, role);
				//boolean macLoggedIn = committeeService.login(user.getLoginId(), user.getPassword());
				if (adminLoggedIn1) {
					System.out.println("Welcome to admin");
					adminOperations();
				} else if(macLoggedIn1) {
				System.out.println("Welcome to mac");
				 macOperations();
				} else{
					System.out.println("Enter the proper credentials");
				}

				break;
			case 2:
				System.out.println("Available Courses...");
				LinkedHashSet<ProgramsOffered> programs;
				programs = appManager.viewAllPrograms();
				Iterator it = programs.iterator();
				while (it.hasNext()) {
					ProgramsOffered program = (ProgramsOffered) it.next();
					System.out.println("ID : " + program.getCollegeID() + " Degree certificate offered  : "
							+ program.getDegreeCertificateOffered() + "Name : " + program.getProgramName()
							+ " Duration : " + program.getDuration() + " Description : " + program.getDescription());
				}
				System.out.println(
						"Please Enter a number according to the program you want to choose or Press 0 to Exit..");
				int input = sc.nextInt();
				if (input == 0)
					break;
				Application application = new Application();
				System.out.println("Enter the applicant name ");
				application.setFullName(sc.nextLine());
				sc.nextLine();
				System.out.println("Enter the date of birth ");
				application.setDateOfBirth(sc.nextLine());
				System.out.println("Enter the highest qualification ");
				application.setHighestQualification(sc.nextLine());
				System.out.println("Enter the marks obtained ");
				application.setMarksObtained(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the email Id");
				application.setEmailId(sc.nextLine());
				System.out.println("Enter the goals ");
				application.setGoals(sc.nextLine());
				it = programs.iterator();
				while (it.hasNext()) {
					ProgramsOffered program = (ProgramsOffered) it.next();
					if (program.getCollegeID() == input) {
						if (program.getApplicantEligibility() == application.getMarksObtained()) {
							application.setStatus("Eligible");
						} else {
							application.setStatus("Not Eligible");
						}
					}
				} // end of while
				int applicationId = appManager.apply(application);
				System.out.println(
						"You Application Id is : " + applicationId + ". Please keep it with you for future refrence.");

			} // end of switch

		} while (loginChoice != 0);

	}

	private static void adminOperations() {
		System.out.println("1) addProgramsOffered");
		System.out.println("2) updateProgramsOffered");
		System.out.println("3) deleteProgramsOffered");
		System.out.println("4) addProgramsScheduled");
		System.out.println("5) updatePramsScheduled");
		System.out.println("6) deleteProgramsScheduled");
		System.out.println("7) viewAllAcceptedApplcation");
		System.out.println("8) viewAllConfirmedApplications");
		System.out.println("9) viewAllRejectedApplications");
		System.out.println("Enter the choice");
		System.out.println();
		int selectChoice = sc.nextInt();
		switch (selectChoice) {
		case 1:
			//addProgramsOffered
			ProgramsOffered addpogoff = new ProgramsOffered();
			System.out.println("Enter the collegeID");
			addpogoff.setCollegeID(sc.nextInt());
			System.out.println("Enter programe name ");
			addpogoff.setProgramName(sc.next());
			System.out.println("Enter the programme description");
			addpogoff.setDescription(sc.next());
			System.out.println("Enter the applicant eligibility");
			addpogoff.setApplicantEligibility(sc.nextInt());
			System.out.println("Enter the duartion");
			addpogoff.setDuration(sc.nextLine());
			System.out.println("Enter the DegreeCertificateOffered");
			addpogoff.setDegreeCertificateOffered(sc.nextLine());
			boolean addedP = adminService.addProgramsOffered(addpogoff);
			if (addedP) {
				System.out.println("Programme added successfully");
			} else {
				System.out.println("Programme is not added succesfully");
			}
			break;
		case 2:
			//updateProgramsOffered
			ProgramsOffered updateP = new ProgramsOffered();
			System.out.println("enter collegeID  to update");
			updateP.setCollegeID(sc.nextInt());
			System.out.println("Enter new programe name ");
			updateP.setProgramName(sc.next());
			System.out.println("Enter the  programme description");
			updateP.setDescription(sc.next());
			System.out.println("Enter the applicant eligibility");
			updateP.setApplicantEligibility(sc.nextInt());
			System.out.println("Enter the duartion");
			updateP.setDuration(sc.nextLine());
			System.out.println("Enter the DegreeCertificateOffered");
			updateP.setDegreeCertificateOffered(sc.nextLine());
			boolean upDate = adminService.updateProgramsOffered(updateP);
			if (upDate) {
				System.out.println("Programme update successfully");
			} else {
				System.out.println("Updation failed");
			}
			break;
		case 3:
			//deleteProgramsOffered
			ProgramsOffered delP = new ProgramsOffered();
			System.out.println("Enter the Programme Name to delete ");
			String delProgramme = sc.next();
			boolean deleted = adminService.deleteProgramsOffered(delProgramme);
			if (deleted) {
				System.out.println("Programme deleted successfully");
			} else {
				System.out.println("Deleted failed");
			}
			break;
		case 4:
			//addProgramsScheduled
		ProgramsScheduled programsScheduled = new ProgramsScheduled();
		System.out.println("Enter the scheduledProgramId");
		programsScheduled.setScheduledProgramId(sc.nextLine());
		System.out.println("Enter the programme Name");
		programsScheduled.setProgramName(sc.nextLine());
		System.out.println("Enter the location");
		programsScheduled.setLocation(sc.nextLine());
		System.out.println("Enter the start date ");
		programsScheduled.setStartDate(sc.nextLine());
		System.out.println("Enter the End date");
		programsScheduled.setEndDate(sc.nextLine());
		System.out.println("Enter the session per week");
		programsScheduled.setSessionPerWeek(sc.nextLine());
		boolean addScheduled = adminService.addProgramsScheduled(programsScheduled);
		if(addScheduled) {
			System.out.println("Programme scheduled successfully ");
		}else {
			System.out.println("failed");
		}
		break;
		case 5:
			//Update program scheduled 
			ProgramsScheduled updatePScheduled = new ProgramsScheduled();
			System.out.println("Enter the scheduledProgramId");
			updatePScheduled.setScheduledProgramId(sc.nextLine());
			System.out.println("Enter the programme Name");
			updatePScheduled.setProgramName(sc.nextLine());
			System.out.println("Enter the location");
			updatePScheduled.setLocation(sc.nextLine());
			System.out.println("Enter the start date ");
			updatePScheduled.setStartDate(sc.nextLine());
			System.out.println("Enter the End date");
			updatePScheduled.setEndDate(sc.nextLine());
			System.out.println("Enter the session per week");
			updatePScheduled.setSessionPerWeek(sc.nextLine());
			boolean updateScheduled = adminService.updateProgramsScheduled(updatePScheduled);
			if(updateScheduled) {
				System.out.println("Programme  scheduled  updated successfully ");
			}else {
				System.out.println("failed");
			}
			break;
		case 6:
			//delete program scheduled
			ProgramsScheduled deletePScheduled = new ProgramsScheduled();
			System.out.println("Enter the scheduled programID to delete ");
			String delete = sc.next();
			boolean deleteScheduled = adminService.deleteProgramsOffered(delete);
			if(deleteScheduled) {
				System.out.println("programe schedule deleted");
			}else {
				System.out.println("failed to deleted");
			}
		break;
		case 7:
			//view all accepted application status
			System.out.println("view all the accepted applications");
			
		case 8:
			//viewAllConfirmedApplications
			ProgramsOffered viewConfirm = new ProgramsOffered();
			System.out.println("");
		case 9:
			//viewAllRejectedApplications
			break;
			default:
			break;
		}	
	}
		private static void macOperations() {
			System.out.println("1) view particular application");
			System.out.println("2) view all application ");
			
		}
}