package com.hcl.boxing;

public class Quiz3 {
		public void show(int x){
			switch(x){
			case 1:
				System.out.println("hi 1");
				break;
			case 2:
				System.out.println("bye 2");
				break;
			case 3:
				System.out.println("hello 3");
			case 4:
				System.out.println("test 4");
			case 5:
				System.out.println("demo 5");
			default:
				System.out.println("default msg");
			}
		}
		public static void main(String[] args) {
			Quiz3 obj=new Quiz3();
			obj.show(3);
		}
}
