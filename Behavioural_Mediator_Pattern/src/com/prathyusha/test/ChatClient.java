package com.prathyusha.test;

import com.prathyusha.model.ChatMediator;
import com.prathyusha.model.ChatMediatorImpl;
import com.prathyusha.model.User;
import com.prathyusha.model.UserImpl;

public class ChatClient {
	
	public static void main(String[] args) {
		
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "Prathyusha");
		User user2 = new UserImpl(mediator, "Pravallika");
		User user3 = new UserImpl(mediator, "Mahesh");
		User user4 = new UserImpl(mediator, "Anusha");
		User user5 = new UserImpl(mediator, "Teja");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		
		user1.send("Hi All");
		
	}

}
