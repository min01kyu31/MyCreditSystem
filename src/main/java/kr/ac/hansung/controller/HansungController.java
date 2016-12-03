package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HansungController {
	
	@RequestMapping("/term_credit")
	public String showOffers(Model model){
		List<hansung> hansungs = hansungService.getCurrent();
		
		model.addAttribute("term_credit",hansungs);
		return "term_credit"
	}
	
	@RequestMapping("/division_credit")
	public String showOffers(Model model){
		return "division_credit"
	}
	
	@RequestMapping("/application")
	public String showOffers(Model model){
		return "application"
	}
	@RequestMapping("/application_menu")
	public String showOffers(Model model){
		return "application_menu"
	}
}