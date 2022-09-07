package com.example.StudentListApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@GetMapping(value="/studentlist")
	public String studentList( Model model) {
		model.addAttribute("students", repository.findAll());
		return "Hello";
		
	}
}