package com.prathyusha.test;

import java.util.Scanner;

import com.prathyusha.model.Currency;
import com.prathyusha.model.DispenseChain;
import com.prathyusha.model.Dollar10Dispenser;
import com.prathyusha.model.Dollar20Dispenser;
import com.prathyusha.model.Dollar50Dispenser;

public class ATMDispenseChain {
	
	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.print("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}

	}

}
