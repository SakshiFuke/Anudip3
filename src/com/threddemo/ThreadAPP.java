package com.threddemo;

import java.lang.*;
class A extends Thread
{
	public void run()
	{
		
			for(int i=0;i<=5;i++)
			{
				System.out.println("First Thread : "+i);
				
			}
	
	}
}
class B extends Thread
{
	public void run()
	{
		
			for(int i=0;i<=5;i++)
			{
				System.out.println("Second Thread :"+i);
				
			}
	
	}
}
public class ThreadAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        a.start();
        B b=new B();
        b.start();
        
        System.out.println("Third Thread");
	}

}