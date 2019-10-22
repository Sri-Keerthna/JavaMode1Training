package com.hcl.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ>{

	@Override
	public int compare(Employ o1, Employ o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

		}
