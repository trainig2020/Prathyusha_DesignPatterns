package com.prathyusha.test;



import com.prathyusha.model.GreenColor;
import com.prathyusha.model.Pentagon;
import com.prathyusha.model.RedColor;
import com.prathyusha.model.Shape;
import com.prathyusha.model.Triangle;

public class BridgePatternTest {
	
	public static void main(String[] args) {
		
		  Shape tri = new Triangle(new RedColor()); 
		  tri.applyColor();
		  
		  Shape pent = new Pentagon(new GreenColor()); 
		  pent.applyColor();
		 
	}

}
