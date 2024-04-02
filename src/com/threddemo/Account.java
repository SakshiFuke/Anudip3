package com.threddemo;

public class Account extends Thread {
	
	static int balance=1000;
	
	public void run()
	{
		synchronized (Account.class) {	//Thread Safe
			
		
		if(balance >800)
		{
			System.out.println(Thread.currentThread().getName()+" "+"your balance is : "+balance+" Srupees u can withdram the amount");
			
			try {
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			balance=200;
			System.out.println(Thread.currentThread().getName()+" "+"after  withdraw your "+"balance is "+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" your balance is "+balance+" so uou cant withdraw the amount");
		}
		}
	}
}
