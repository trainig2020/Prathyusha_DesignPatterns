package com.prathyusha.model;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.print(" Adding features of Luxury Car...");
	}
	
	

}
