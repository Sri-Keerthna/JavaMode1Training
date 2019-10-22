package com.hcl.enums;
enum Student{
	Anisha, Laksh,Rihab,Keerthna,Niveditha
}
public class Enum1 {

	public static void show() {
		Student[] arrStudent= Student.values();
		for (Student student : arrStudent) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		show();
	}
	
}
