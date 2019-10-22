package com.hcl.boxing;

public class OverloadDemo {
	
public void show(int x){
	System.out.println("show method INT "+x);
}

public void show(String x){
	System.out.println("show method STRING "+x);
}

public void show(boolean x){
	System.out.println("show method BOOLEAN "+x);
}

public void show(double x){
	System.out.println("show method DOUBLE "+x);
}
public static void main(String[] args) {
	
	OverloadDemo obj=new OverloadDemo();
	obj.show(12);
	obj.show(true);
	obj.show("HCL");
	obj.show(12.5);	
}
}
