package com.hcl.asr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom { 
  /**
* The main entry point.
* @param args has the args
*/
  public static void main(String[] args) { 
    // read the custom input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter your name ");
    try {  
      String name = br.readLine();
      System.out.println("name is " + name);
    } catch (IOException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
