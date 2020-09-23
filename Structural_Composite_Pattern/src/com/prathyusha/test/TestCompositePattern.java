package com.prathyusha.test;

import com.prathyusha.model.Circle;
import com.prathyusha.model.Drawing;
import com.prathyusha.model.Shape;
import com.prathyusha.model.Triangle;

public class TestCompositePattern {
	
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
	    drawing.draw("Green");
		
	}

}
