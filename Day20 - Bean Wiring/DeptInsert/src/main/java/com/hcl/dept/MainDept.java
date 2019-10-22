package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDept {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("dept.xml");
		DeptInsertDao d=(DeptInsertDao)ctx.getBean("myDept");
		d.insertEmploy();
		System.out.println("Record Inserted");
	}
}
