package com.hcl.inh;
class First{
	static{
		System.out.println("base class static");
	}
	public First(){
		System.out.println("base class constructor");
	}
}

class Second extends First{
	static{
		System.out.println("Derived class static");
	}
	public Second(){
		System.out.println("derived class constructor");
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		new Second(); // both base and derived static will display then the base and derived constructors will display
	}
}

