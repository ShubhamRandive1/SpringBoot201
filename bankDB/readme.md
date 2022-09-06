Question 1:
What are the advantages of using Hibernate over JDBC?
Question 2:
● Explain difference between JPA and Hibernate:
● Explain about the Layered Architecture of a Java Based Business application:
Question 3:
AccountDao provides an API that allows access and manipulation of accounts. Your job is to implement the
AccountDaoImpl class using JPA and Hibernate. Create the use case classes to call and test the given methods.
Database name: bankDB
Table:
account
id: int Primary key
email: varchar
address: varchar
balance:double
AccountDao Interface:
public interface AccountDao {
Account findById(int id)
String save(Account account);
String update(Account account)
String remove(int id);
String withdraw(double amount,int accountId)
String deposit(double amount,int accountId)
}
Note: last 5 method should return appropriate message.
