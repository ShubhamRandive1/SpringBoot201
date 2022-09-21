package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class MyController {
	
	List<Employee> empList = new ArrayList<>();
	
	
	
	@RequestMapping("/EmployeeList")
	@ResponseBody
	public List<Employee> employee(){
		
		Employee emp1 = new Employee(1, "Ram", "HR", 80000);
		
		Employee emp2 = new Employee(2, "Raju", "Marketing", 90000);
		
		Employee emp3 = new Employee(3, "Shayam", "Development", 75000);
		
		Employee emp4 = new Employee(4, "Kabira", "R&D", 95000);
		
		Employee emp5 = new Employee(5, "Baburao", "IT", 85000);
		
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		
		return empList;
		
	}
	
	
	
	
//	@RequestMapping("/hello")
//	@ResponseBody // return the value as a raw data
//	public String sayHello() {
//		
//		return "Welcome to spring Boot";
//		
//		//it will be treated as view name that is jsp page name;
//	}
//	
//	@RequestMapping("/hello/inside")
//	@ResponseBody
//	public String sayInsideHello() {
//		
//		return "inside hello";
//	}
//	
//	@RequestMapping("stu")
//	@ResponseBody
//	public Student callStu() {
//		
//		Student stt = new Student(1, "Raju", 890);
//		return stt;
//	}
//	
//	@RequestMapping("list")
//	@ResponseBody
//	public List<Student> ss(){
//		
//		List<Student> soo = new ArrayList<>();
//		
//		Student s1 = new Student(2, "Baburao", 999);
//		
//		Student s2 = new Student(4, "Shayam", 888);
//		
//		soo.add(s1);
//		
//		soo.add(s2);
//		
//		return soo;
//	};
	
	

}
