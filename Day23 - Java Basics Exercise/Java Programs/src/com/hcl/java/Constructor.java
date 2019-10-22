package com.hcl.java;

class Test   
{  
    int i;   
    public Test(int k)  
    {  
        i=k;  
        
    }  
    public Test(int k, int m)  
    {  
    	System.out.println("Hi I am assigning the value max(k, m) to i"); 
        if(k>m)  
        {  
            i=k;
        }  
        else   
        {  
            i=m;    
        }  
    }  
}    
public class Constructor {
	public static void main (String args[])   
    {  
        Tests test1 = new Tests(10);  
        Tests test2 = new Tests(12, 15);  
        System.out.println(test1.i);  
        System.out.println(test2.i);  
        
    }  
} 

