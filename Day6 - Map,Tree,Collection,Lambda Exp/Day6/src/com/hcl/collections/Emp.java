package com.hcl.collections;

public class Emp {
  int empno;
  String name;
  double salary;
  /**
* The main entry point.
* @param empno has the empno
* @param name has the name
* @param salary has the salary
*/
  
  public Emp(int empno, String name, double salary) {
    super();
    this.empno = empno;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
  }

}
