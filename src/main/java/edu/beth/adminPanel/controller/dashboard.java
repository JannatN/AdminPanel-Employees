package edu.beth.adminPanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dashboard {
	
	@GetMapping("/dashboard")
	public String viewDashboard() {
		return "dashboard";
	}

}
