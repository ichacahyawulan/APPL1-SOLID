package com.appl.solid.Models;

import com.appl.solid.Interface.IShape;

public class Square implements IShape {

	@Override
	public String Draw() {
		return "I'm Square";
	}

}
