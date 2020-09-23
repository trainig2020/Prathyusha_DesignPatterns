package com.prathyusha.factory;

import com.prathyusha.model.Computer;
import com.prathyusha.model.PC;
import com.prathyusha.model.Server;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

		Computer comp = null;
		switch (type) {
		case PC:
			comp = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			comp = new Server(ram, hdd, cpu);
			break;
		}

		return comp;
	}
}
