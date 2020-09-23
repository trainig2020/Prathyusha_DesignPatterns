package com.prathyusha.test;

import com.prathyusha.model.ShapeMaker;

public class TestFacadePattern {
	
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }

}
