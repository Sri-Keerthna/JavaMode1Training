package com.hcl.boxing;

public class StuSearch {
	public Student showStudent(int sno){
		Student s=null;
		if(sno==1){
			s=new Student();
			s.sno=100;
			s.name="sss";
			s.city="xxx";
			s.cgpa="8";
		}
		
		if(sno==3){
			s=new Student();
			s.sno=103;
			s.name="ffd";
			s.city="yyy";
			s.cgpa="9";
		}
		return s;
	}
	public static void main(String[] args) {
		
		StuSearch obj=new StuSearch();
		Student res=obj.showStudent(1);
		if(res!=null){
			System.out.println(res);
		}
		else{
			System.out.println("sno not found");
		}
	}
	
}
