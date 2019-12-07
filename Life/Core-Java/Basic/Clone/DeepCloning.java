package com.corejava.clone;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmpInfo emp1 = new EmpInfo(101, "Alex",new Address("102 Thomas Nagar"));
		
		System.out.println("Object Created using new keyword");
		
		System.out.println(emp1);
		
		EmpInfo emp2 = (EmpInfo)emp1.clone();
		
		System.out.println("Cloned Emp Object");
		
		emp2.address.setStreetName("013 Ashok nagar");
		
		System.out.println(emp1);
		
		System.out.println(emp2);
	}

}

class EmpInfo implements Cloneable{
	int empId;
	String empName;
	Address address;
	
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

	
	public EmpInfo(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		EmpInfo empInfo = (EmpInfo) super.clone();
		empInfo.setAddress(new Address(getAddress().getStreetName())); 
		
		return empInfo;
	}
	@Override
	public String toString() {
		return "EmpInfo [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}

class Address {
	String streetName;

	public Address(String streetName) {
		super();
		this.streetName = streetName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + "]";
	}
	
	
}

