package com.hcl.asr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadEmploy {
  /**
* The main entry point.
* @param args has the args
*/
  public static void main(String[] args) {
    try {
      FileInputStream  fin = new FileInputStream("c:/Files/employ.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Employ e = (Employ)objin.readObject();
      System.out.println(e);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
