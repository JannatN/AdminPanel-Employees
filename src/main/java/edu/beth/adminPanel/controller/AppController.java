package edu.beth.adminPanel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.User;
import edu.beth.adminPanel.repository.UserRepository;
import edu.beth.adminPanel.service.DepartmentService;
import edu.beth.adminPanel.service.EmployeeService;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;


	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);

		return "register_success";
	}

<<<<<<< HEAD

//	@GetMapping("departments")
//	public String departments(Model model) {
//		model.addAttribute("departments", service.getDepartments());
//
//		return "departments";
//	}
	

=======
>>>>>>> 32b7cd6fdc4059dd91820783d695f7edeab8f093

	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);

		return "users";
	}
}
