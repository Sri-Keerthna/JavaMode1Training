package com.hcl.collections;
class Data<T>{
	public void swap(T x,T y){
		T t;
		t=x;
		x=y;
		y=t;
		System.out.println("x value "+x+" y value "+y);
	}
}
public class SwapDemo {
	public static void main(String[] args) {
		Data obj=new Data();
		int x,y;
		x=12;
		y=13;
		obj.swap(x, y);
		double d1=10.5,d2=33.5;
		obj.swap(d1, d2);
		String s1="good",s2="morning";
		obj.swap(s1, s2);
		Boolean b1=true,b2=false;
		obj.swap(b1, b2);
		}
}
