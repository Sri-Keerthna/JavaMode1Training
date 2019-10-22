package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
  /**
* The main entry point.
* @param args has the args
*/
  public static void main(String[] args) {
    List<Integer> lstdata = new ArrayList<Integer>();
    lstdata.add(new Integer(42));
    lstdata.add(new Integer(2));
    lstdata.add(new Integer(45));
    lstdata.add(new Integer(5));
    int sum;
    lstdata.forEach(p -> {      //lambda expressions
      if (p >= 15) { 
        System.out.println(p);
      }
    });
  }
}
