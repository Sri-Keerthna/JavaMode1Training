package com.hcl.asr;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  /**
* The main entry point.
* @param args haas an args
*/
  public static void main(String[] args) { 
    try { 
      DataInputStream din = new DataInputStream(new FileInputStream("c:/Files/data.txt"));
      int x = din.readInt();
      x++;
      System.out.println("x value " + x);
      String name = din.readUTF();
      System.out.println("name " + name);
      Double bas = din.readDouble();
      System.out.println("Basics " + bas);
      Boolean flag = din.readBoolean();
      System.out.println("flag " + flag);
      din.close();
    } catch (FileNotFoundException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
