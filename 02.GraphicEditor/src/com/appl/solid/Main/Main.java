package com.appl.solid.Main;

import com.appl.solid.Models.*;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		GraphicEditor editor = new GraphicEditor();
		editor.DrawShape(circle);
		editor.DrawShape(rectangle);
		editor.DrawShape(square);
	}
}