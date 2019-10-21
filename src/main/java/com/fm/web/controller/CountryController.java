package com.fm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fm.web.entity.Country;
import com.fm.web.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@RequestMapping("/list")
	public String getCountryList(Model theModel) {
		
		List<Country> countries = countryService.getCountryService();
		theModel.addAttribute("countries", countries);
		
		return "country-list";
	}
	
}
