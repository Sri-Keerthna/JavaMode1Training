package com.hcl.ex;

public class Div {
public static void main(String[] args) {
	int a,b,c;
	try {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("Division "+c);
	} 
	
	catch(ArithmeticException e){
		System.out.println("division by zero is impossible");
	}
	catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("string cannot be converted as integer");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Arguments are not passed ");
	}
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		System.out.println("program by hcl participants");
	}
}
}
