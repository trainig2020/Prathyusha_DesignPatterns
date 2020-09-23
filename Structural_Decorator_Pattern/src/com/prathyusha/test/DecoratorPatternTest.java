package com.prathyusha.test;

import com.prathyusha.model.BasicCar;
import com.prathyusha.model.Car;
import com.prathyusha.model.LuxuryCar;
import com.prathyusha.model.SportsCar;

public class DecoratorPatternTest {
	
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}


}
