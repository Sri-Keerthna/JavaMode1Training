package com.hcl.inh;

public class CustomString {
static String name;
public CustomString(String name){
	this.name=name;
}
public int Length(){
	char[] arr=name.toCharArray();
	int i=0;
	for (char c : arr) {
		i++;
	}
	return i;
}
public void position(){
	char[] arr=name.toCharArray();
	for (char c : arr) {
		if(!(arr.equals(c)){
			arr.to
		}
	}
	System.out.println(c.toUpper);
	
}
public static void main(String[] args) {
	CustomString obj=new CustomString("aaa");
	System.out.println(obj.Length());
	System.out.println(obj.position());
}
}
