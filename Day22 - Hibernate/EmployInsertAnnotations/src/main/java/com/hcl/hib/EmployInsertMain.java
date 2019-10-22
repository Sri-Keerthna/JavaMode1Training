package com.hcl.hib;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class EmployInsertMain {
	public static void main(String[] args) {
		Employ e=new Employ();
		Scanner sc=new Scanner(System.in);
		int empno,basic;
		String name,dept,desig;
		System.out.println("Enter Employ No : ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employ Name : ");
		name=sc.nextLine();
		System.out.println("Enter Department : ");
		dept=sc.nextLine();
		System.out.println("Enter Designation : ");
		desig=sc.nextLine();
		System.out.println("Enter Basic : ");
		basic=Integer.parseInt(sc.nextLine());
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		empno=0;
		Query q=s.createQuery("SELECT max(empno) from Employ");
		for(Iterator it=q.iterate();it.hasNext();) {
			empno=(Integer)it.next();
		}
		empno++;
		System.out.println(empno);
		
		
	}

}
