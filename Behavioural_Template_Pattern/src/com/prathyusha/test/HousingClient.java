package com.prathyusha.test;

import com.prathyusha.model.GlassHouse;
import com.prathyusha.model.HouseTemplate;
import com.prathyusha.model.WoodenHouse;

public class HousingClient {
	
public static void main(String[] args) {
	
	
		HouseTemplate houseType = new WoodenHouse();
		
		//using template method
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}


}
