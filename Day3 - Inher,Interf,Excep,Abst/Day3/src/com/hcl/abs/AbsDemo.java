package com.hcl.abs;
abstract class Training{
	abstract void name();
	abstract void email();
}

class Anubhav extends Training{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is Anubhav");
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("anubhav@gmail.com");
	}	
}

class SaiKrishna extends Training{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is SaiKrishna");
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("saikrishna@gmail.com");
	}
}
public class AbsDemo {

	public static void main(String[] args) {
		//Training ti=new Anubhav();
		//Training t2=new SaiKrishna();
		
		Training[] arr=new Training[]{
				new Anubhav(),
				new SaiKrishna()
		};
		for (Training t : arr) {
			t.name();
			t.email();
			
		}
	}
}
