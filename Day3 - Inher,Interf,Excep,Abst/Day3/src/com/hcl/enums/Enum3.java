package com.hcl.enums;

public class Enum3 {

	public static void display(Object...ob){
		for (Object object : ob) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
	public static void show(int day,String...name){
		System.out.print(day+" ");
		for (String s : name) {
			System.out.print(s+"  "); // without ln it will print the values as given
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(2,"visha","prem");
		show(3,"visha","prem","janani","jehanat");
		show(4,"rishab","satya","sai kumar");
		
		display();
		display("Ram",12,true,12.5);
	}
}
