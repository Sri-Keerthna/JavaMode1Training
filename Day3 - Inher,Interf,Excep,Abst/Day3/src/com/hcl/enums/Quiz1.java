package com.hcl.enums;
enum Test{
	A,B,C,V,F,Y,U;
	private Test(){
		System.out.println("hi");
	}
}
public class Quiz1 {
public static void main(String[] args) {
	Test t=Test.Y; //how many members are in enum that many times constructor will display
}
}
