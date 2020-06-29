package com.appl.solid.Models;

import com.appl.solid.Interface.IShape;

public class Circle implements IShape {

	@Override
	public String Draw() {
		return "I'm Circle";
	}
	
}
