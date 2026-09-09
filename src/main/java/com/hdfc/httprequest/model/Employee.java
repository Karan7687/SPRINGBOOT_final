package com.hdfc.httprequest.model;

public class Employee {

	private String name;
	private Integer id;
	private double salary;
	private String address;

	public Employee(String name, Integer id, double salary, String address) {

		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {

		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

}
