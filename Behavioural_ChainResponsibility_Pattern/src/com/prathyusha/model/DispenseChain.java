package com.prathyusha.model;

public interface DispenseChain {
	
    void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);

}
