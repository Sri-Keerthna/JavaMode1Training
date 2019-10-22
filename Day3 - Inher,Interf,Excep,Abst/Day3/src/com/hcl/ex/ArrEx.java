package com.hcl.ex;

public class ArrEx {
public static void main(String[] args) {
	int[] a=new int[]{12,5,3};
	try {
		a[10]=5/0; //works from right to left 
	} 
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("array size should not be exceeded");
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("shd not be zero");
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
