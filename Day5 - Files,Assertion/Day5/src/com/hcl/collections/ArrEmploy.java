package com.hcl.collections;

import java.util.List;
import java.util.ArrayList;

public class ArrEmploy {
public static void main(String[] args) {
	List lstEmploy=new ArrayList();
	lstEmploy.add(new Employ(1,"xx",857));
	lstEmploy.add(new Employ(4,"yy",879));
	lstEmploy.add(new Employ(2,"bb",534));
	lstEmploy.add(new Employ(3,"jj",897));
	for (Object ob : lstEmploy) {
		Employ e=(Employ)ob;
		System.out.println(e);
		
	}
}
}
