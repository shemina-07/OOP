import java.io.*;
import java.util.*;
class emp
{
int eNo;
String eName;
double eSalary;
emp(int eNo,String eName,double eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
}
class employee
{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
emp[] em=new emp[n];
for(int i=0;i<n;i++){
System.out.println("Enter eNo:");
int eNo=sc.nextInt();
sc.nextLine();
System.out.println("Enter eName:");
String eName=sc.nextLine();
System.out.println("Enter eSalary:");
double eSalary=sc.nextDouble();
em[i]=new emp(eNo,eName,eSalary);
}
System.out.println("Enter a search value");
int s=sc.nextInt();
for(int i=0;i<n;i++){
if(em[i].eNo==s){
System.out.println("eNo is : "+em[i].eNo+ "\t eName is : "+em[i].eName +"\teSalary is : "+em[i].eSalary);
}
}
}
}
