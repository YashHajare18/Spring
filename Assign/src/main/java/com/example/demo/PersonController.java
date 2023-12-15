package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

	@GetMapping("person")
	public String before()
	{
		return "Person";
		
	}
	@PostMapping("person")
	public String afterSubmit(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("age") int age,Model model) {
		Person person=new Person();
		person.setName(name);
		person.setAddress("address");
		person.setAge(age);
		model.addAttribute("pr", person);
		return "View";
	}
}
