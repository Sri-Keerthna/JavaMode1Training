package com.hcl.boxing;

public class ConDemo {

	static{
		System.out.println("Static Constructor");
	}
	
	public ConDemo(){
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		new ConDemo();
	}
}
