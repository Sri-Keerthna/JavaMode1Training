package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaMaxMin {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"HP laptop",25000));
		list.add(new Product(2,"Acer laptop",45000));
		list.add(new Product(3,"Dell laptop",55000));
		
		list.stream().filter(p->p.price>=30000).forEach(x->{
			System.out.println(x);
		});
		System.out.println(" ");
		System.out.println("name starts with H");
		list.stream().filter(p->p.name.startsWith("H")).forEach(x->{
			System.out.println(x);
		});
		Product maxp=list.stream().max((p1,p2)->p1.price>=p2.price?1:-1).get();
		System.out.println(" ");
		System.out.println("max price record");
		System.out.println(maxp);
		
		Product minp=list.stream().min((p1,p2)->p1.price>=p2.price?1:-1).get();
		System.out.println(" ");
		System.out.println("min price record");
		System.out.println(minp);
	}
}
