package com.prathyusha.test;

import com.prathyusha.model.Computer;

public class ComputerClient {
	
	public static void main(String[] args) {
			
		Computer comp = new Computer.Builder("2GB", "27B","Intel i7").build();
		
		Computer comp1 = new Computer.Builder("2GB", "27B","Intel i7")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println("Builder Factory "+comp);
		System.out.println("Builder Factory "+comp1);
		
		
		
	}

}


































/*
 * System.out.println("Builder PC Config: " +comp);
 * System.out.println("Builder PC Config: " +comp1);
 */