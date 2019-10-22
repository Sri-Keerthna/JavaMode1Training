package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Empno : ");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ WHERE empno="+empno);
		List list=q.list();
		if(list.size()!=0) {
			Employ e=(Employ)list.get(0);
			System.out.println("Employ No........" +e.getEmpno());
			System.out.println("Name of Employ..." +e.getName());
			System.out.println("Department......." +e.getDept());
			System.out.println("Designation......" +e.getDesig());
			System.out.println("Basic............" +e.getBasic());
			System.out.println();
		} else {
			System.out.println("***Record Not Found***");
		}
	}
	

}
