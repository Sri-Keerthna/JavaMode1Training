package com.hcl.intf;

import org.omg.CORBA.OBJ_ADAPTER;

public class Quiz2 {
public static void main(String[] args) {
	Object[] arr=new Object[]
			{
					12,"welcome",12.5,"hcl",'A',"java",true,11,11.6,"bangalore"
			};
	for (Object object : arr) {
		/* if u need a specific value then give the specific datatype alone*/
		if(object instanceof Integer){
			System.out.println(object);
		}
		if(object instanceof String){
			System.out.println(object);
		}
		if(object instanceof Double){
			System.out.println(object);
		}
		if(object instanceof Boolean){
			System.out.println(object);
		}
		if(object instanceof Character){
			System.out.println(object);
		}
}
}
}