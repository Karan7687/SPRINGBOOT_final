package com.hdfc.httprequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.httprequest.model.Employee;

@RestController
public class EmployeeController {

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {

		return emp;
	}

}
