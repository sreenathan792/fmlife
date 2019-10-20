package com.fm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	@RequestMapping("/list")
	public String getCountryList() {
		
		return "country-list";
	}
	
}
