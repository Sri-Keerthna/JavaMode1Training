package com.hcl.collections;

import java.util.List;
import java.util.ArrayList;

public class ArrIntEx {
public static void main(String[] args) {
	List num=new ArrayList();
	num.add(new Integer(44));
	num.add(new Integer(12));
	num.add(new Integer(3));
	num.add(new Integer(45));
	num.add(new Integer(33));
	num.add(new Integer(43));
	int sum=0;
	for (Object ob : num) {
		sum+=(Integer)ob;
		
	}
		System.out.println("sum "+sum);
}
}
