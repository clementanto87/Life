package com.corejava.clone;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmpDetail empdetail = new EmpDetail(101, "Alex");
		
		System.out.println("Object Created using new keyword");
		
		System.out.println(empdetail);
		
		EmpDetail detail = (EmpDetail)empdetail.clone();
		
		System.out.println("Cloned Emp Object");
		
		detail.setEmpId(102);
		System.out.println(detail);
		System.out.println(empdetail);
	}

}

class EmpDetail implements Cloneable{
	int empId;
	String empName;
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmpDetail(int empId, String empName) {
		super();
		System.out.println("constructor called");
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmpDetail [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}
