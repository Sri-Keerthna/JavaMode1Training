package com.hcl.boxing;

public class StuTest {
	public static void main(String[] args) {
		Student s=new Student();
		s.sno=10;
		s.name="sri";
		s.city="xxx";
		s.cgpa="8";
		
		Student s2=new Student();
		s2.sno=11;
		s2.name="sri";
		s2.city="xxx";
		s2.cgpa="8";
		
		System.out.println(s.sno==s2.sno);
		System.out.println(s.equals(s2));
	}
}
