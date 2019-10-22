package com.hcl.asr;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
  /**
* The main entry point.
* @param args has the args
*/
  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add(new Emp(1,"xx",857));
    s.add(new Emp(4,"yy",879));
    s.add(new Emp(2,"bb",534));
    s.add(new Emp(3,"jj",897));
    System.out.println("**sorted data**");
    s.forEach(System.out::println);
  }
}
