package com.hcl.ex;

public class Custom  { 
  /**
* The main entry point.
* @param a has a value of a
* @param b has a value of b
* @throws NegativeException throws NegativeException
* @throws NumberZeroException throws NumberZeroException
*/
  public void sum(int a, int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("negative nos not allowed");
    }  
    if (a == 0 || b == 0) {  
      flag = false;
      throw new NumberZeroException("zero is invalid");
    }  
    if (flag == true) {  
      c = a + b;
      System.out.println("sum is " + c);
    }  
  }  
  /**
* The main entry point.
* @param args has list of args
*/
  
  public static void main(String[] args) { 
    /**
* <a> has the value of </a>.
*/
    int a = 5; 
    int b = - 12;
    try { 
      new Custom().sum(a,b);
    }   catch (NegativeException | NumberZeroException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  } 
} 
