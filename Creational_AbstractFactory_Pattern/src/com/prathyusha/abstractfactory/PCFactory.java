package com.prathyusha.abstractfactory;

import com.prathyusha.model.Computer;
import com.prathyusha.model.PC;

public class PCFactory implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public Computer createComputer() {
		
		return new PC(ram,hdd,cpu);
	}

}
