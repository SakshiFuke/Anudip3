package com.threddemo;

public class AccountMain {

	public static void main(String[] args) {

		Account ac1=new Account();
		ac1.setName("Sakshi");
		
		Account ac2=new Account();
		ac2.setName("Fuke");
		
		ac1.start();
		ac2.start();
	}

}
