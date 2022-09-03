SB201 Day 3 Assignment
Qusestion 1
Database name: db1
Table:
employee
empId: int Primary key
name: varchar not null
address: varchar not null
salary: int not null
Implement the following methods of the EmployeeDao interface
using JPA with hibernate.
● void save(Employee emp);
● public String getAddressOfEmployee(int empId);
● public String giveBonusToEmployee(int empId, int
bonus);
● public boolean deleteEmployee(int empId);
Write a class to call all the above methods and display the result
