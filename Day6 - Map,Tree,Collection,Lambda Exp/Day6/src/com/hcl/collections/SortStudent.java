package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
public static void main(String[] args) {
	Comparator<Student> s=new CityComparator();
	Comparator<Student> s1=new CgpaComparator();
	Set<Student> setstudent=new TreeSet<Student>(s);
	Set<Student> setstudent1=new TreeSet<Student>(s1);
	setstudent.add(new Student("sri","keerthi","cbe",6 ));
	setstudent.add(new Student("keerthi","varshini","tup",8));
	setstudent.add(new Student("visha","lakshi","vellore",7));
	setstudent.add(new Student("nivi","R","trichy",5));
	System.out.println("Student list");
	setstudent.forEach(System.out::println);
}
}
