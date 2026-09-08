package com.hdfc.httprequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	/*
	 * @GetMapping("/employees/{id}") public String getEmployee(@PathVariable
	 * Integer id) {
	 * 
	 * return "empId: " + id;
	 * 
	 * }
	 * 
	 * @GetMapping("/employees/{id}/{name}") public String
	 * getEmployeeDetails(@PathVariable Integer id, @PathVariable String name
	 * 
	 * ) {
	 * 
	 * return "Name: " + name + " Id: " + id;
	 * 
	 * }
	 * 
	 * @GetMapping("/emp/{id}") public String getEmpAgain(@PathVariable("id")
	 * Integer empId) {
	 * 
	 * return "empId: " + empId;
	 * 
	 * // explicit mapping }
	 */

	@GetMapping("/employees")
	public String getEmployees(@RequestParam String department) {

		return "Department :" + department;

	}

	@GetMapping("/employeeDetails")
	public String getEmployees(@RequestParam("department") String dept, @RequestParam(required = false) String city,
			@RequestParam double salary) {

		return "Department: " + dept + " \nCity :" + city + " \nSalary :" + salary;

		// all three query params are compulsory, else make it required=false
		/*
		 * Department: IT City :null Salary :58000.0
		 */
	}

	@GetMapping("/employeeDet")
	public String getEmployees2(@RequestParam(defaultValue="All departments") String department) {

		// optional query param
		return "Department :" + department;

		// output(department not given)---> null
		// if department given---> IT
	}
	
	

}
