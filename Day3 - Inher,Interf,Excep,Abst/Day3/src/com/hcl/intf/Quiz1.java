package com.hcl.intf;
class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
}
class HrEmploy extends Employ{
	public HrEmploy(String name){
		super(name);
	}
}
class JavaEmploy extends Employ{
	public JavaEmploy(String name){
		super(name);
	}
}
public class Quiz1 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]
				{
						new HrEmploy("Sagar"),
						new JavaEmploy("Nivi"),
						new HrEmploy("Sakshi"),
						new JavaEmploy("SRI"),
						new HrEmploy("Sathya"),
						new JavaEmploy("Sajid"),
						new HrEmploy("Vahid"),
						new JavaEmploy("Nivi")
				};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}
}

