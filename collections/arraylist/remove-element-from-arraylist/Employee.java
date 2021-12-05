package com.gaurav.ExProject2;
/**
 * An employee class for ArrayList remove example
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class Employee {
	
	private int id;
	
	private String name;
	
	private int salary;
	
	// a constructor will all the fields
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// getters and setters for the variables
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Override to string method to print student objects
	@Override
	public String toString() {
		return "{"+this.getId()+", "+ this.getName()+ ", "+this.getSalary()+"}";
	}
}
