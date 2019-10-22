package com.hcl.boxing;
class Demo{
	static{
		System.out.println("hi");
	}
}
public class Quiz7 {
		public static void main(String[] args) {
			System.out.println("bye"); //static runs first which has first priority
		}
		static{
			System.out.println("hello");
	}
}
