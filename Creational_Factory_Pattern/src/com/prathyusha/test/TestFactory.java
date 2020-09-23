package com.prathyusha.test;

import com.prathyusha.factory.ComputerFactory;
import com.prathyusha.factory.ComputerType;
import com.prathyusha.model.Computer;

public class TestFactory {
	
	public static void main(String[] args) {
		
		
		
			Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "2.4 GHz");

			Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "2.9 GHz");
			
			System.out.println("Factory PC Config: " +pc);
			System.out.println("Factory Server Config: "+server);
		}
		
		
		
		
	}
	
