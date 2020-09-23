package com.prathyusha.test;

import com.prathyusha.abstractfactory.PCFactory;
import com.prathyusha.abstractfactory.ServerFactory;
import com.prathyusha.model.Computer;

public class TestAbstractFactory {
	
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = com.prathyusha.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = com.prathyusha.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config: " +pc);
		System.out.println("AbstractFactory Server Config: " +server);
	}

}
