package entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name = "state", column = @Column(name="Home_State")),
		@AttributeOverride(name ="city", column = @Column(name="Home_City")),
		@AttributeOverride(name="pincode", column = @Column(name="Home_pincode"))
	})
	
	
	private Address home_Address;
	
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name = "state", column = @Column(name="office_State")),
		@AttributeOverride(name ="city", column = @Column(name="office_City")),
		@AttributeOverride(name="pincode", column = @Column(name="office_pincode"))
		
	})
	
	private Address office_Address;
	
	
	private int salary;


	public Employee() {
		super();
	}


	public Employee(Address home_Address, Address office_Address, int salary) {
		super();
		this.home_Address = home_Address;
		this.office_Address = office_Address;
		this.salary = salary;
	}


	public Address getHome_Address() {
		return home_Address;
	}


	public void setHome_Address(Address home_Address) {
		this.home_Address = home_Address;
	}


	public Address getOffice_Address() {
		return office_Address;
	}


	public void setOffice_Address(Address office_Address) {
		this.office_Address = office_Address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [home_Address=" + home_Address + ", office_Address=" + office_Address + ", salary=" + salary
				+ "]";
	}
	
	
	
	
	

}
