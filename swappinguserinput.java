import java.io.*;
import java.util.*;
class swappinguserinput{
public static void main(String[]args){
int a;
int b;
int temp;

System.out.println("Enter first number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("After swapping first number is"+a+"second number is"+b);
}
}
