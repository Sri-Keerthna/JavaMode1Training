package com.hcl.collections;

import java.util.Comparator;

public class CgpaComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    // TODO Auto-generated method stub
    Student s1 = (Student)o1;
    Student s2 = (Student)o2;
    if (s1.cgp >= s2.cgp) { 
      return 1;
    } else {
      return -1; // change the return values with 1 to get desc order in sortemploy 
    }
  }
}