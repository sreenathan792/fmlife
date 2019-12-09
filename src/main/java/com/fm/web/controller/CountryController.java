package com.fm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fm.web.entity.Country;
import com.fm.web.service.CountryService;

@Controller
@RequestMapping(value = "/country")
public class CountryController {

	@Autowired
	CountryService countryService;

	@GetMapping(value = "/list")
	public String getCountryList(Model theModel) {

		List<Country> countries = countryService.getCountryService();
		theModel.addAttribute("countries", countries);

		return "country-list";
	}

	@GetMapping(value = "/add")
	public String newCountryForm(Model theModel) {

		theModel.addAttribute("country", new Country());
		return "new-country";
	}

	@PostMapping(value = "/add")
	public String addCountry(@ModelAttribute Country country) {

		System.out.println(country.getCountryName());
		System.out.println(country.getFederation());
		System.out.println(country.getContinentalFederation());
		
		countryService.addNewCountry(country);
		 
		return "redirect:list";
	}
	
	@GetMapping(value = "/edit/{id}")
	public String editCountry(@PathVariable int id, Model model) {
		
		Country country = countryService.fetchCountry(id);
		model.addAttribute("country", country);
		
		return "edit-country";
	}
	
	@PostMapping(value = "/edit/update")
	public String updateCountry(@ModelAttribute Country country) {
		
		countryService.updateCountry(country);

		return "redirect:../list";
	}
	
	@GetMapping(value = "/delete/{id}")
	public String deleteCountry(@PathVariable int id) {
		
		countryService.deleteCountry(id);
		
		return "redirect:../list";
	}
	

}
