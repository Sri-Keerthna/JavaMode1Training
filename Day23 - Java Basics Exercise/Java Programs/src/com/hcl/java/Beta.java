package com.hcl.java;

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class Beta extends Alpha 
{ 
    public Beta()  {  System.out.print("beta ");  } 
    public String type = "b "; 
    void go() 
    { 
       
        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
        new Beta().go(); 
    } 
} 