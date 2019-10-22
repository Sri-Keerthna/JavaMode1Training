package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeptCrud {
	
	public List<Dept> showDept() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Dept");
		List<Dept> lstDept=q.list();
		return lstDept;
	}

}
