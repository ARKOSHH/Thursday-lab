package todaylab;

import java.util.*;
class Member
{
Scanner s = new Scanner(System.in);
public int age,phone,salary;
public String address,name;
public void printSalary() {
	this.salary=salary;
	System.out.println("Salary : "+salary);
	
}
}
class Employee extends Member
{
String spec,dept;
public void input()
{
System.out.println("Enter the Employee name :");
name=s.next();
System.out.println("Enter the Employee age : ");
age=s.nextInt();
System.out.println("Enter the Employee Salary : ");
salary=s.nextInt();
System.out.println("Enter the Employee Specialization : ");
spec=s.next();
System.out.println("Enter the Employee Department : ");
dept=s.next();
System.out.println("Enter the Employee Address : ");
address=s.next();
}
public void show()
{
System.out.println("The Employee Details are :");
System.out.println("Employee name : "+name);
System.out.println("Employee age : "+age);
System.out.println("Employee Department name : "+dept);
System.out.println("Employee Specialization : "+spec);
}
}

class Manager extends Member
{
String spec,dept;
public void input()
{
System.out.println("Enter the Manager name :");
name=s.next();
System.out.println("Enter the Manager age : ");
age=s.nextInt();
System.out.println("Enter the Manager Salary : ");
salary=s.nextInt();
System.out.println("Enter the Manager Specialization : ");
spec=s.next();
System.out.println("Enter the Manager Department : ");
dept=s.next();
System.out.println("Enter the Manager Address : ");
address=s.next();
}
public void show()
{
System.out.println("The Manager Details are :");
System.out.println("Manager name : "+name);
System.out.println("Manager age : "+age);

System.out.println("Manager Department name : "+dept);
System.out.println("Manager Specialization : "+spec);
}
}
public class EmployeManegerdemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
Employee e = new Employee();
Manager a = new Manager();
e.input();
System.out.println();
System.out.println();
a.input();
System.out.println();
System.out.println();
e.show();
e.printSalary();
System.out.println();
System.out.println();
a.show();
a.printSalary();
}

}