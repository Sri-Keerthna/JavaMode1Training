package com.hcl.obj;

import com.hcl.java.SbExample;

public class sbExample {
	public StringBuilder show(int age,String name,String course,String city) { 
		StringBuilder sbError=new StringBuilder(); 
		boolean isValid=true; 

		/* validation  for age*/
		if(age<=20){
			sbError.append("age must be greater than 20"+"\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("name must contain both first and last name"+"\r\n");
			isValid=false;
		}
		if(!course.equalsIgnoreCase("java")){
			sbError.append("only java course allowed"+"\r\n");
			isValid=false;
		}
		if(isValid==true){
	sbError.append("Age "+age+"\r\n");
	sbError.append("Name "+name+"\r\n");
	sbError.append("Course "+course+"\r\n");
	sbError.append("City "+city+"\r\n");
}
		return sbError;
}
 public static void main(String[] args){
	 int age;
	 String name,course,city;
	 age=22;
	 name="sri K";
	 course="Java";
	 city="Ecity";
	StringBuilder sbRes= new sbExample().show(age, name, course, city);
	System.out.println(sbRes);
 }
}

