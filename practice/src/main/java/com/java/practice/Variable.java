package com.java.practice;

public class Variable {
	String name="karthik"; //instance variable
	static int b=20; //static variable
	
	void setData() {
		int a; //local variable
		a=10;
		float f=a;//widening
		int b=(int)f; //narrowing //type cast float to int
		int c=130; //overflow
		byte b1=(byte)c;
		byte b2=10;
		byte b3=20;
		byte b4=(byte)(b2+b3); //adding lower type
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of f is "+f);
		System.out.println("The value of b is "+b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
	
	//addition of 2 numbers
	void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	void printData() {
		setData();
		System.out.println(name);
		System.out.println(b);
	}
};