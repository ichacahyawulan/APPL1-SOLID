package com.appl.solid;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Name");
        Manager manager = new Manager("Manager Name",  new ArrayList<String>());

        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(employee);
        listEmployee.add(manager);

        DetailsPrinter printer = new DetailsPrinter(listEmployee);
        printer.printDetails();
	}
}