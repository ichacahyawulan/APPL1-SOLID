package com.appl.solid.Models;

import com.appl.solid.Interface.IShape;

public class GraphicEditor {
	public void DrawShape (IShape shape){
        System.out.println(shape.Draw());
    }
}
