package com.dp.prototype;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

	List<String> name = new ArrayList<>();

	public List<String> createEmpList() {
		name.add("Alex");
		name.add("Anto");
		name.add("Tony");
		name.add("Anne");
		name.add("Tino");
		
		return name;
	}

	public List<String> cloneing(List<String> empName){
		
		List<String> empName1 = empName.stream().collect(Collectors.toList());
		
		return empName1;
	}
}
