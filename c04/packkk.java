package graphics;
import java.io.*;
import java.util.*;

interface shape
{
double area();
}
class rectangle implements shape
{

Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Length and Breadth");
float l=sc.nextFloat();
float b=sc.nextFloat();
double result=l*b;
return result;
}
}

class triangle implements shape
{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Base and Height");
float ba=sc.nextFloat();
float he=sc.nextFloat();
double result=0.5*ba*he;
return result;
}
}
class square implements shape
{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Side");
float s=sc.nextFloat();
double result=s*s;
return result;
}
}
class circle implements shape
{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Radius");
float r=sc.nextFloat();
double result=Math.PI*r*r;
return result;
}
}
class packkk
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice: 1.Rectangle, 2.Triangle, 3.Square, 4.Circle");
int c=sc.nextInt();
switch(c)
{
case 1:
rectangle re=new rectangle();
System.out.println("Area of Rectangle=" + re.area());
break;
case 2:
triangle tr=new triangle();
System.out.println("Area of Triangle=" + tr.area());
break;
case 3:
square sq=new square();
System.out.println("Area of Square=" + sq.area());
break;
case 4:
circle ci=new circle();
System.out.println("Area of Circle=" + ci.area());
break;
default:
System.out.println("Invalid Choice!!!!");
}
}
}
