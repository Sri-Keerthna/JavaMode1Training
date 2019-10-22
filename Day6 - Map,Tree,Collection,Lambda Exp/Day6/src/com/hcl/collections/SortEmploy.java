package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
	Set<Employ> setemploy=new TreeSet<Employ>(c);
	setemploy.add(new Employ(1, "sri", 65465));
	setemploy.add(new Employ(2, "keerthi", 87645));
	setemploy.add(new Employ(6, "visha", 82347));
	setemploy.add(new Employ(4, "nivi", 59839));
	System.out.println("Employ list");
	setemploy.forEach(System.out::println);
}
}