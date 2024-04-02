package com.threddemo;

class MyThread extends Thread
{
	@Override
	public void run() {
		System.out.println("Sakshi- this is my task!!");
	}
}
class MyThread2 extends Thread
{
	@Override
	public void run() {
		System.out.println("this is my task!!");
	}
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		th.setName("Sakshi");
		th.setPriority(1);
		th.getName();
		
		String name =th.getName();
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
	
		
		MyThread2 th1=new MyThread2();
		th1.setName("Amruta");
		System.out.println(th1.getName());
		System.out.println(th1.getId());
		th1.start();
	}

}
