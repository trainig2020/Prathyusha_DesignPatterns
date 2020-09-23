package com.prathyusha.test;

import com.prathyusha.model.State;
import com.prathyusha.model.TVContext;
import com.prathyusha.model.TVStartState;
import com.prathyusha.model.TVStopState;

public class TVRemote {
	
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}


}
