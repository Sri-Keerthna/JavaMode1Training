package com.hcl.boxing;

public class BoxStu {
	
	public void show(Object ob){
		//int x=(Integer)ob;
		Student s=(Student)ob;
		System.out.println(s);
	}
public static void main(String[] args) {
	Student stu=new Student();
	stu.sno=10;
	stu.name="sri";
	stu.city="xxx";
	stu.cgpa="8";

	new BoxStu().show(stu);
}
}
