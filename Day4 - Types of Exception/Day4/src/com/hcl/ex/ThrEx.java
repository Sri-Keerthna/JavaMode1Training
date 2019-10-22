package com.hcl.ex;

public class ThrEx {
  /**
  *The main entry point.
  * @param x has the value of x
  */
  public void show(int x) { 
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("Negative numbers not allowed");
    }
    if (x == 0) { 
      flag = false;
      throw new ArithmeticException("zero is invalid");
    }
    if (flag == true) {
      System.out.println("x value is " + x);
    }
  }
  /**
* The main entry point.
* @param args has a args
*/
  
  public static void main(String[] args) {
    int n = - 12;
    try {  
      new ThrEx().show(n);
    } catch (NumberFormatException e) { 
      System.out.println(e.getMessage());
    }  catch (ArithmeticException e) {  
      System.out.println(e.getMessage());
    }  catch (Exception e) { 
      System.out.println(e.getMessage());
    } 
  } 
} 
