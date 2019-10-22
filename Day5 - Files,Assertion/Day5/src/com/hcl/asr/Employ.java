package com.hcl.asr;

import java.io.Serializable;

public class Employ implements Serializable {
  int empno;
  String name;
  transient double basic;//keep ur data invisible to public
  /**
* The main entry point.
* @param empno has the empno
* @param name has the name
* @param basic has the basic
*/
  
  public Employ(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  
  public static void main(String[] args) { 
  }
}
