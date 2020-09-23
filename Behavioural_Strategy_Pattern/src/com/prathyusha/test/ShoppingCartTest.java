package com.prathyusha.test;

import com.prathyusha.model.CreditCardStrategy;
import com.prathyusha.model.Item;
import com.prathyusha.model.PaypalStrategy;
import com.prathyusha.model.ShoppingCart;

public class ShoppingCartTest {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",100);
		Item item2 = new Item("5678",400);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("prathyusha@gmail.com", "Google@2008"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Prathyusha", "123456789", "456", "10/25"));
	}

}
