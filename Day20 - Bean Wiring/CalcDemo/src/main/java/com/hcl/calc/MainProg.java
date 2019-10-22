package com.hcl.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Calc.xml");
	Calc c=(Calc)ctx.getBean("bean1");
	System.out.println("Sum is:"+c.sum());
	System.out.println("Sub is:"+c.sub());
	System.out.println("Mul is:"+c.mult());
}
}
