package com.hcl.enums;
class First{
	public void show(){
		System.out.println("Show method from class first");
	}
}
class Second extends First{
	public void show(){
		//super.show();// it will print the base cls also 
		System.out.println("show mwthod from class second");
	}
}
public class Inhoverride {
public static void main(String[] args) {
	//Second obj=new Second();
	//obj.show();
	
	First ob1=new First();
	Second ob2=new Second();
	First f1=(First)ob2;
	f1.show();
	First f2=(Second)ob2;
	f2.show();
	//First obj=new Second();
	//obj.show(); //priority comes with left side so base cls will be displayed
}
}

	
	
