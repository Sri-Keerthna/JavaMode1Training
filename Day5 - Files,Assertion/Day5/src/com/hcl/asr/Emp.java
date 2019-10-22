package com.hcl.asr;

public class Emp implements Comparable {

  int empno;
  String name;
  double basic;
  /**
* The main entry point.
* @param empno has the empno
* @param name has the name
* @param basic has the basic
*/
  
  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  
  @Override
  public String toString() {
    return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  
  @Override
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    Emp e = (Emp)o;
    return name.compareTo(e.name);
  } 
}
