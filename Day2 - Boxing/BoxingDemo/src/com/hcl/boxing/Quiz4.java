package com.hcl.boxing;

public class Quiz4 {

	public void show(Object ob){
		// string can run without unboxing
		if(ob=="ABC"){
				System.out.println("correct ");
		}
		else{
			System.out.println("wrong");
		}
	}
	public static void main(String[] args) {
		String s="ABC";
		Quiz4 obj=new Quiz4();
		obj.show(s);
	}
}
