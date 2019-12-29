package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequetDeligationController {
	// To Redirect[External Resource]
	@GetMapping("/redirect")
	public String redirectRequest() {

		return "redirect:http://pixabay.com";

	}// End Of Redirect

	// To Forword[For internal Resource]
	@GetMapping("/forword")
	public String forwordRequest() {

		return "forword:/WEB-INF/views/loginform";
	} // End Of forword

	// To Include[For internal Resource]
	@GetMapping("/include")
	public String includeRequest() {

		return "include:/loginform";
	}// End Of include

}
