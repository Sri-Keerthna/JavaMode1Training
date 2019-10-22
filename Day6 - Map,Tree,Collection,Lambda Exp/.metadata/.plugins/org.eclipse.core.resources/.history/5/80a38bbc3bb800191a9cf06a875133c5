package com.hcl.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaProduct {
public static void main(String[] args) {
	List<Product> list=new ArrayList<Product>();
	list.add(new Product(1,"HP laptop",25000));
	list.add(new Product(2,"Acer laptop",45000));
	list.add(new Product(3,"Dell laptop",55000));
	
	//Collections.sort(list,(p1,p2)->{
		//return p1.name.compareTo(p2.name);
	//});
	
	Collections.sort(list,(p1,p2)->{
		return (int)(p1.price-p2.price);//since it is double
	});
	System.out.println("**sorted by price wise**");
	
	for (Product product : list) {
		System.out.println(product);
	}
}
}
