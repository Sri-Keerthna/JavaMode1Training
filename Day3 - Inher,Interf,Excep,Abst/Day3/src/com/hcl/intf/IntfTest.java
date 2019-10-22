package com.hcl.intf;

interface IFirst{
	default void name(){
		System.out.println("name from IFirst");
	}
}
interface ISecond{
	default void name(){
		System.out.println("name from ISecond");
	}
}
interface IThird{
	default void name(){
		System.out.println("name from IThird");
	}
}
class Demo implements IFirst,ISecond,IThird{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
	}	
}
public class IntfTest {
public static void main(String[] args) {
	new Demo().name();
}
}
