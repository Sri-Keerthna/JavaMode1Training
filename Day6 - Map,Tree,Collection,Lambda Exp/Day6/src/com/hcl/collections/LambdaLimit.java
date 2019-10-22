package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
	public static void main(String[] args) {
		List<Integer> lstdata=new ArrayList<Integer>();
		lstdata.add(new Integer(42));
		lstdata.add(new Integer(2));
		lstdata.add(new Integer(45));
		lstdata.add(new Integer(5));
		lstdata.add(new Integer(32));
		lstdata.add(new Integer(78));
		lstdata.add(new Integer(59));
		lstdata.stream().limit(3).forEach(p->{
			System.out.println(p);
	});
		System.out.println(" ");
		System.out.println("After skipping 2 records");
		lstdata.stream().skip(2).forEach(p->{
			System.out.println(p);
		});
	}
}
