package com.hdfc.httprequest.model;

public class Employee {

	private String name;
	private int id;
	private double salary;
	private String address;

	public Employee(String name, int id, double salary, String address) {

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
