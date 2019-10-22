package com.hcl.ex;
class c1{
	 void test(){
		System.out.println("welcome");
	}
}
class c2 extends c1{
	 /*static*/ void test(){ //either both shd be static or nthg shd be static if one is static  it will show error bcz it is derived from base
		System.out.println("bye");
	}
}
public class Quiz2 {
public static void main(String[] args) {
	c2 obj=new c2();
	obj.test();
}
}
