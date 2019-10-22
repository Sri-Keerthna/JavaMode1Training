package com.hcl.collections;

public class Employ {
  int empno;
  String name;
  double basic;

  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
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
}
