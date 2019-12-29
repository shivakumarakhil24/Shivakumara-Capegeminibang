package com.capgemini.universityadmission.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.universityadmission.bean.Application;
import com.capgemini.universityadmission.bean.ProgramsOffered;
import com.capgemini.universityadmission.bean.ProgramsScheduled;
import com.capgemini.universityadmission.bean.UniversityResponse;
import com.capgemini.universityadmission.bean.Users;
import com.capgemini.universityadmission.services.AdminService;
import com.capgemini.universityadmission.services.ApplicantService;
import com.capgemini.universityadmission.services.CommitteeService;

@CrossOrigin(allowedHeaders = "*", origins = "*", allowCredentials = "true")
@RestController

public class MainController {
	@Autowired
	private ApplicantService service;
	@Autowired
	private CommitteeService serviceCommittee;
	@Autowired
	private AdminService serviceAdmin;

	@GetMapping(path = "/getAllProgram", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public UniversityResponse getAllPrograms() {

		List<ProgramsOffered> applList = service.viewAllPrograms();
		UniversityResponse response = new UniversityResponse();
		if (applList != null && !applList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Course  Found...");
			response.setProgramsOfferedList(applList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Get Course!!!");
		}
		return response;
	}// End of getAllPrograms()

	@GetMapping(path = "/getAllApplications", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	    public UniversityResponse getAllApplications() {

		List<Application> applList = serviceCommittee.viewAllApplications();
		UniversityResponse response = new UniversityResponse();
		if (applList != null && !applList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Course  Found...");
			response.setApplicationsList(applList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Get Course!!!");
		}
		return response;
	}// End of getAllPrograms()

	@PostMapping(path = "/addApplicant", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_ATOM_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE })
	public UniversityResponse apply(@RequestBody Application application) {
		System.out.println(application.getApplicationId());
		boolean isAdded = service.apply(application);
		UniversityResponse response = new UniversityResponse();

		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("applicant added Successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to add Record...");
		}

		return response;
	}

	@GetMapping(path = "/getStatus", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody (if we write RestController in class then we dont need
	// ResponseBody)
	public UniversityResponse getStatus(int appllicationId) {
		List<String> status = service.viewStatus(appllicationId);
		UniversityResponse response = new UniversityResponse();
		if (status != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("ApplicationId  Found...");
			response.setStatus(status);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Application Id" + appllicationId + " Not Found!!!");
		}

		return response;

	}// End of getStatus()

	// Admin
	@PutMapping(path = "/addProgramsScheduled", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public <AdminResponse> UniversityResponse addProgramsSchedule(@RequestBody ProgramsScheduled programsScheduled) {
		boolean isAdded = serviceAdmin.addProgramsScheduled(programsScheduled);
		UniversityResponse response = new UniversityResponse();
		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("programsScheduled Added Sucessfully....");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add programsScheduled Record!!");
		}
		return response;
	}// isadded

	@DeleteMapping(path = "/deleteProgramsScheduled", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public UniversityResponse deleteprogramsScheduled(int scheduledProgramId) {
		boolean isDeleted = serviceAdmin.deleteProgramsScheduled(scheduledProgramId);
		UniversityResponse response = new UniversityResponse();

		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Sucess");
			response.setDescription("ProgramScheduled Deleted Sucessfully....");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Delete ProgramScheduled Record!!");
		}
		return response;

	}

	@PostMapping(path = "/updateProgramsScheduled", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public boolean updateProgramsScheduled(@RequestBody ProgramsScheduled programsScheduled) {
		return serviceAdmin.updateProgramsScheduled(programsScheduled);
	}

	@PutMapping(path = "/addProgramsOffered", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public UniversityResponse addProgramsOffered(@RequestBody ProgramsOffered program) {
		boolean isAdded = serviceAdmin.addProgramsOffered(program);

		UniversityResponse response = new UniversityResponse();

		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Programs Added Successfully....");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add programs Record!!!");
		}

		return response;

	}// End of addProgramsOffered()

	@DeleteMapping(path = "/deleteProgramsOffered"
	/*
	 * produces = {MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE}
	 */)
	public UniversityResponse deleteProgramsOffered(String programName) {
		boolean isDelete = serviceAdmin.deleteProgramsOffered(programName);

		UniversityResponse response = new UniversityResponse();

		if (isDelete) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Programs Delete Successfully....");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Delete Programs Record!!!");
		}
		return response;
	}// end of deleteProgramsoffered()

	@PostMapping(path = "/updateProgramsOffered", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public UniversityResponse updateProgramsOffered(@RequestBody ProgramsOffered programName) {
		boolean isUpdate = serviceAdmin.updateProgramsOffered(programName);
		UniversityResponse response = new UniversityResponse();
		if (isUpdate) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Programs update Successfully....");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to update Programs Record!!!");
		}
		return response;
	}

//	@PostMapping("/uas/mac/login/{id}/{password}")
	@PostMapping("/macLogin")
	public Users loginMac(@RequestBody Users user) {

		Users mac = null;
		mac = serviceCommittee.login(user);

		return mac;

	}// End of login()

	@PostMapping(path = "/adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Users loginService(@RequestBody Users user) {
		Users usermaster = serviceAdmin.adminLogin(user.getLoginId(), user.getPassword());
		if (usermaster != null) {
			return usermaster;
		} else {
			return null;
		}

	}// End of login()

	@GetMapping("/logout")
	public ModelAndView logOut(ModelAndView modelAndView, HttpSession session) {
		session.invalidate();
		modelAndView.setViewName("index");

		return modelAndView;
	}// end of getLoginForm()

	@GetMapping("/status/{applicationId}/{status}")
	public boolean acceptReject(@PathVariable("applicationId") int applicationId,
			@PathVariable("status") String status) {
		return serviceCommittee.acceptRejectConfirm(applicationId, status);

	}

	@GetMapping(path = "/viewAllAccepted", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public UniversityResponse viewAllAccepted() {

		List<Application> accepted = serviceAdmin.viewAllAcceptedApplications();
		UniversityResponse response = new UniversityResponse();
		if (accepted != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Course  Found...");
			response.setApplicationsList(accepted);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Get Course!!!");
		}
		return response;
	}

	@GetMapping(path = "/viewAllRejected", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public UniversityResponse viewAllRejected() {

		List<Application> rejected = serviceAdmin.viewAllRejectedApplications();
		UniversityResponse response = new UniversityResponse();
		if (rejected != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Course  Found...");
			response.setApplicationsList(rejected);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Get Course!!!");
		}
		return response;

	}

	@GetMapping(path = "/viewAllConfirm", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public UniversityResponse viewAllConfirm() {

		List<Application> confirm = serviceAdmin.viewAllConfirmedApplications();
		UniversityResponse response = new UniversityResponse();
		if (confirm != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Course  Found...");
			response.setApplicationsList(confirm);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Get Course!!!");
		}
		return response;

	}
}
