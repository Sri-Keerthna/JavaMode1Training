package com.hcl.collections;
import java.util.LinkedHashSet;
//import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set s=new LinkedHashSet();
	//Set s=new HashSet();
	s.add("vinod");
	s.add("hema");
	s.add("sri");
	s.add("raghu");
	s.add("anubhav");
	
	s.add("vinod");//to get the duplicates
	s.add("hema");
	s.add("sri");
	s.add("vinod");
	s.add("hema");
	s.add("sri");
	s.add("raghu");
	s.add("anubhav");
	s.add("vinod");
	s.add("sri");
	s.add("raghu");
	s.add("anubhav");
	
	System.out.println("**hashset data**");
	s.forEach(System.out::println);
	}
}
