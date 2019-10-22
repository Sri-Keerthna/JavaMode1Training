package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add("vishali");
	s.add("lakshmi");
	s.add("anubhav");
	s.add("hema");
	s.add("anisha");
	System.out.println("**sorted data**");
	s.forEach(System.out::println);
}
}
