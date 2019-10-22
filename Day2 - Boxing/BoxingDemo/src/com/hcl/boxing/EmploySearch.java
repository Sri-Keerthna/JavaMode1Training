package com.hcl.boxing;

public class EmploySearch {

	public Employ showEmploy(int empno){
		Employ e=null;
		if(empno==1){
			e=new Employ();
			e.empno=100;
			e.name="sss";
			e.basic=4365;
		}
		
		if(empno==3){
			e=new Employ();
			e.empno=103;
			e.name="ffd";
			e.basic=5845;
		}
		return e;
	}
	public static void main(String[] args) {
		
		EmploySearch obj=new EmploySearch();
		Employ res=obj.showEmploy(1);
		if(res!=null){
			System.out.println(res);
		}
		else{
			System.out.println("empno not found");
		}
	}
	
}
