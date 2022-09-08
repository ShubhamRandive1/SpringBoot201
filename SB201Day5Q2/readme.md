Consider the following database schema:
Database name: db1
Table: employee
empId: int primary key
name: varchar not null
address: varchar not null
salary: int not null
Implement the following EmployeeDao interface using JPA with
hibernate:-
public interface EmployeeDao{
public List<Employee> getAllEmployees() throws EmployeeException
public List<Employee> getEmployeesByAddress(String address) throws
EmployeeException
