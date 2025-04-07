import java.io.*;
import java.util.*;
class person
{
String name;
String gender;
String address;
int age;
person(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class employee extends person
{
int empId;
String cName;
String quali;
int salary;
employee(String name,String gender,String address,int age,int empId,String cName,String quali,int salary)
{
super(name,gender,address,age);
this.empId=empId;
this.cName=cName;
this.quali=quali;
this.salary=salary;
}
}
class teacher extends employee
{
String sub;
String dept;
int teachId;
teacher(String name, String gender, String address, int age, int empId, String cName, String quali, int salary, String sub, String dept, int teachId) 
{
super(name, gender, address, age, empId, cName, quali, salary);  // Include 'age' here
this.sub = sub;
this.dept = dept;
this.teachId = teachId;
}
void display()
{ 
System.out.println("Emp ID: " + empId);
System.out.println("College Name: " + cName);
System.out.println("Salary: " + salary);
System.out.println("Teacher ID: " + teachId);
System.out.println("Subject: " + sub);
System.out.println("Department: " + dept);
}
}
public class pers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter number of teachers(n):");
n=sc.nextInt();
sc.nextLine();
teacher[] te=new teacher[n];
for( i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"teacher details:");
System.out.println("Enter name:");
String name = sc.nextLine();
System.out.println("Enter gender:");
String gender = sc.nextLine();
System.out.println("Enter address:");
String address = sc.nextLine();
System.out.println("Enter age:");
int age = sc.nextInt();
sc.nextLine(); 
System.out.println("Enter employee ID:");
int empId = sc.nextInt();
sc.nextLine();  
System.out.println("Enter college name:");
String cName = sc.nextLine();
System.out.println("Enter qualification:");
String quali = sc.nextLine();
System.out.println("Enter salary:");
int salary = sc.nextInt();
sc.nextLine(); 
System.out.println("Enter subject:");
String sub = sc.nextLine();
System.out.println("Enter department:");
String dept = sc.nextLine();
System.out.println("Enter teacher ID:");
int teachId = sc.nextInt();
sc.nextLine(); 
te[i]=new teacher(name, gender, address, age, empId, cName, quali, salary, sub, dept, teachId);
}
for(i=0;i<n;i++)
{
te[i].display();
}
sc.close();
}
}

