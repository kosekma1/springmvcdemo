package com.luv2code.springdemo.mvc;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@Value("#{favoriteLanguageOptions}")
	private Map<String, String> favoriteLanguageOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student());

		theModel.addAttribute("theCountryOptions", countryOptions);
		theModel.addAttribute("theFavoriteLanguageOptions", favoriteLanguageOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		System.out.println("The Student: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";

	}

}
