package com.appl.solid;

import java.util.ArrayList;

public class DetailsPrinter {
	private ArrayList<Employee> employees;
	
	public DetailsPrinter(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void printDetails() {
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}
}