package com.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		String name1="Sakshi";
		String name2="fuke";
		String name3= name1.concat(name2);
		System.out.println(name3);
		
		String name4="Sakshi";
		String name5="fuke";
		String name6=name4+name5;
		System.out.println(name6);
		
		//Using equal() method 
		String s="hell";
		String s1="hello";
		String s2="hello";
		System.out.println(s.equals(s1));//false
		System.out.println(s1.equals(s2));//true
		
	}

}
