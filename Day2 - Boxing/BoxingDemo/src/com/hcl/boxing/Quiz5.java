package com.hcl.boxing;

public class Quiz5 {

	public void check(int x){
		if(x=2){ // assignment operator cant be run in java
			System.out.println("hi");
		}
		else{
			System.out.println("bye");
		}
	}
	public static void main(String[] args) {
		new Quiz5().check(2);
	}
}
