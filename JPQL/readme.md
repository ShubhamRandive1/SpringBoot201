Question1:
Write a JPA application to implement HAS-A mapping using the Join
Table strategy of following classes.
class Employee{
private int empID;
private String name;
private String gender;
private int salary;
private Set<Address> empAddress = new HashSet();
}
class Address{
private String state;
private String city;
private String pincode;
private String type;
}
Write a Main class to insert 4 Employee record inside the table, Each
Employee should have 2 addresses.
