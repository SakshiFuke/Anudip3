package com.threddemo;

class Customer
{
	int amount=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw....1");
		if(this.amount<amount)
		{
			System.out.println("Less balance waiting for deposite 2");	
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("withdraw completed 3");
	}
	 synchronized void deposite(int amount)
	{
		System.out.println("Going to Deposite....4");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("deposite compeleted 5");
		notifyAll();
	}
}
public class WaitNotifyDemo {
	public static void main(String[] args) {
		
		final Customer customer=new Customer();
		
		new Thread()
		{
			public void run()
			{
				customer.withdraw(15000);
			} 
		}.start();
		new Thread()
		{
			public void run()
			{
				customer.deposite(10000);
			}
		}.start();
		
	}

}
