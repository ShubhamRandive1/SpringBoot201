package com.masai;

import java.util.Map;

public class Demo {
	
	private Map<Department, Employee> theMap;

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	
	public void myInit() {
		
		System.out.println("inside myInit method");
		
	}
	
	public void cleanUp() {
		
		System.out.println("inside cleanUp method");
	}
	
	
	
	public void shoDetails() {
		
		System.out.println("inside shoDetails of Demo class");
		
		System.out.println(theMap);
		
//		for(Department dept : theMap.keySet()) {
//			
//			System.out.println("The Key Number :"+ dept);
//			
//		}
//		
//		for(Employee emp : theMap.values()) {
//			
//			System.out.println("The Corresponding value :"+ emp);
//			
//		}
		
	}

}
