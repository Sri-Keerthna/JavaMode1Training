package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeprtCrud {
	
	public List<Department> showDepartment() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> lstDepartment=q.list();
		return lstDepartment;
	}
	
	public Department searchDepartment(int deptno) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department WHERE deptno="+deptno);
		List<Department> lstDepartment=q.list();
		Department Department=null;
		if(lstDepartment.size()!=0) {
			Department=lstDepartment.get(0);
		}
		return Department;
	}
	
	
	
	

}
