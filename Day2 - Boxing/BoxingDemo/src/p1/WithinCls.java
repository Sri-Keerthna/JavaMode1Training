package p1;

public class WithinCls {

	private int empno=10;
	public String name="Sri";
	protected String city="Tup";
	double basic=4566;
	
	public void show(){
		WithinCls obj=new WithinCls();
		System.out.println(obj.empno);
		System.out.println(obj.name);
		System.out.println(obj.city);
		System.out.println(obj.basic);
	}
}
