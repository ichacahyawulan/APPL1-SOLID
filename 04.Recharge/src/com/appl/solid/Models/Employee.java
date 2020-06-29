package com.appl.solid.Models;

import com.appl.solid.Interface.ISleeper;

public class Employee extends Worker implements ISleeper {
	public Employee(String id) {
		super(id);
	}

	@Override
	public void sleep() {
		//sleep
	}
}