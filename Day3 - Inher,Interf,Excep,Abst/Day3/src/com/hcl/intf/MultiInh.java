package com.hcl.intf;

interface IOne{
	void name();
}
interface ITwo{
	void email();
}

class Test implements IOne,ITwo{

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("hema@gmail.com");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("company HCL");
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}
}
