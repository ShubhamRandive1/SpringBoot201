package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	
	private String name;
	
	private String gender;
	
	private int salary;
	
	@Embedded
	@ElementCollection
	@JoinTable(name ="empAddress" , joinColumns = @JoinColumn(name="emp_id"))
	private Set<Address> empAddress = new HashSet<>();

	public Employee() {
		super();
	}

	public Employee(int empid, String name, String gender, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	

}
