package com.hcl.ex;
class ca{
	int a,b;
	public ca(){
		a=5;
		b=8;
	}
	@Override
	public String toString() {
		return "c1 [a=" + a + ", b=" + b + "]";
	}
}
class cb extends ca{
	public cb(int a,int b){
		
	}
}
public class Quiz3 {
public static void main(String[] args) {
	cb obj=new cb(12,5);
	System.out.println(obj);
}
}
