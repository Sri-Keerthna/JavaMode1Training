package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
  /**
  * The files took input.
  * @param args has a arg
  */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("D:/hcljava/Day4/Day4/src/com/hcl/ex/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) { 
        System.out.println((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}