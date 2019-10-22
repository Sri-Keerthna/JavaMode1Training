package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.dept.DeptQueryDao;

public class MainSearchDept {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DeptQueryDao d=(DeptQueryDao)ctx.getBean("myDao");
		d.searchDept(2);	
	}
}
