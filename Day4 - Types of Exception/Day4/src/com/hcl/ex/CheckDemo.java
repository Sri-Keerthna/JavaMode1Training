package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckDemo {
  public static void main(String[] args) throws FileNotFoundException { 
    FileInputStream f1 = new FileInputStream("c:/hello.txt");
  }
}
