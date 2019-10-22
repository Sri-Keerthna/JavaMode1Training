package com.hcl.intf;
interface ITraining{
	void name();
	void email();
}

class Hema implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name is hema");
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("hema@gmail.com");
	}	
}

class Keerthna implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name is KEERTHNA");
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("keerthna@gmail.com");
	}
	
}
public class IntfDemo {
public static void main(String[] args) {
	ITraining[] arr=new ITraining[]
			{
					new Hema(),
					new Keerthna()
			};
	for (ITraining t : arr) {
		t.name();
		t.email();
		
	}
}
}
