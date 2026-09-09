package com.hdfc.httprequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.httprequest.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employees/{id}")
	public String getEmployee(@PathVariable Integer id) {
		return "Employee ID : " + id;
	}

	@GetMapping("/employees/{id}/{name}")
	public String getEmployeeDetails(@PathVariable Integer id, @PathVariable String name) {

		return "Employee ID : " + id + ", Name : " + name;
	}

	@GetMapping("/employees")
	public String getEmployees(@RequestParam String department) {

		return "Department : " + department;
	}

	@GetMapping("/employees/search")
	public String searchEmployees(@RequestParam String department, @RequestParam String location) {

		return "Department : " + department + ", Location : " + location;
	}

	@GetMapping("/employees/filter")
	public String filterEmployees(@RequestParam(defaultValue = "ALL") String department) {

		return "Department : " + department;
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employee;
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {

		employee.setId(id);
		return employee;
		
	}

}
