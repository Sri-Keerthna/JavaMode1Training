package com.hcl.ex;
class First{
	public void show(){
		System.out.println("show method from first");
	}
}
class Second extends First{
	public void show(){
		System.out.println("show method from second");
	}
}
public class Quiz1 {
public static void main(String[] args) {
	First ob1=new First();
	Second ob2;
	try {
		ob2 = (Second)ob1;
		ob2.show();
	}
	catch(ClassCastException e){
		System.out.println("First cannot be cast to second");
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
