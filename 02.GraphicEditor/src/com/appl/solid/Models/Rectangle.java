package com.appl.solid.Models;

import com.appl.solid.Interface.IShape;

public class Rectangle implements IShape {

	@Override
	public String Draw() {
		return "I'm Rectangle";
	}

}
