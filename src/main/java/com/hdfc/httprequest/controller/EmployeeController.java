package com.hdfc.httprequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees/{id}")
	public String getEmployee(@PathVariable Integer id) {

		return "empId: " + id;

	}

	@GetMapping("/employees/{id}/{name}")
	public String getEmployeeDetails(@PathVariable Integer id, @PathVariable String name

	) {

		return "Name: " + name + " Id: " + id;

	}

	@GetMapping("/emp/{id}")
	public String getEmpAgain(@PathVariable("id") Integer empId) {

		return "empId: " + empId;
		
		//explicit mapping
	}

}
