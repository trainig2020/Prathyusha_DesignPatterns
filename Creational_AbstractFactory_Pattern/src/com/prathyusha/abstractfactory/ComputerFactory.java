package com.prathyusha.abstractfactory;

import com.prathyusha.model.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
