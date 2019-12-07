package com.dp.prototype;

import java.util.List;

public class PrototypeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		
		List<String> empList = employee.cloneing(employee.createEmpList());
		
		System.out.println(empList);

	}

}
