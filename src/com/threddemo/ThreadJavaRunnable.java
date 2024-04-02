package com.threddemo;

class Thread1 implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 1= "+i);
		}
		
	}
	
}
class Thread2 implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 2= "+i);
		}
		
	}
	
}
public class ThreadJavaRunnable {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		
		Thread2 t2=new Thread2();
		Thread tt=new Thread(t2);
		tt.start();
		
		System.out.println("my name is main thread");
	}

}
