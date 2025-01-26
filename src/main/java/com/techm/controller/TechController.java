package com.techm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TechController {
	
	 @GetMapping("/main")
	    public String getHome(Model model) {
	        model.addAttribute("currentYear", java.time.Year.now().getValue());
	        return "home"; 
	    }

	@GetMapping("/home")
	@ResponseBody
	public String geteste() {
		return "home";
	}
	 
	

}
