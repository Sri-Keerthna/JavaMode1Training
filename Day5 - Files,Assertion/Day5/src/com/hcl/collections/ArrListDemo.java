package com.hcl.collections;
import java.util.List;
import java.util.ArrayList;

public class ArrListDemo {
public static void main(String[] args) {
	List lstnames =new ArrayList();
	lstnames.add("anubhav");
	lstnames.add("vinod");
	lstnames.add("prem");
	lstnames.add("visalakshi");
	lstnames.add("raghu");
	System.out.println("NAMES are ");
	//for (Object object : lstnames) {
		//System.out.println(object);
	//}
	System.out.println("JDK 1.8");
	lstnames.forEach(System.out::println);
	/*edit records*/
	lstnames.set(2, "prem reddy");
	System.out.println(" ");
	System.out.println("list aftere update : ");
	lstnames.forEach(System.out::println);
	/*to remove a record*/
	System.out.println(" ");
	System.out.println("list after removing by index");
	lstnames.remove(1);
	lstnames.forEach(System.out::println);
	System.out.println(" ");
	lstnames.remove("vinod");
	System.out.println("list of removing my obj");
	lstnames.forEach(System.out::println);
	System.out.println(" ");
	System.out.println("4th element "+lstnames.get(2));//get the specific name through get method
	
}
}
