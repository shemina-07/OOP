import java.io.*;
import java.util.*;
 interface shape
{
void area();
void perimeter();
}
class circle implements shape
{
int r;
Scanner sc=new Scanner(System.in);

public void area()
{
System.out.println("Enter Radius");
r=sc.nextInt();
double area=Math.PI*r*r;
System.out.println("Area of Circle="+area);
}
public void perimeter()
{
System.out.println("Enter Radius");
r=sc.nextInt();
double peri=2*Math.PI*r;
System.out.println("Perimeter of Circle="+peri);
}
}
class rectangle implements shape
{
int l,b;
Scanner sc=new Scanner(System.in);

public void area()
{
System.out.println("Enter Length");
l=sc.nextInt();
System.out.println("Enter Breadth");
b=sc.nextInt();
double area=l*b;
System.out.println("Area of Rectangle="+area);
}
public void perimeter()
{
System.out.println("Enter Length");
l=sc.nextInt();
System.out.println("Enter Breadth");
b=sc.nextInt();
double peri=2*(l+b);
System.out.println("Perimeter of Rectangle="+peri);
}
}
class abstraction
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Menu:1.Circle,2.Rectangle");
int ch=sc.nextInt();
switch(ch)
{
case 1:
circle sh=new circle();
sh.area();
sh.perimeter();
break;
case 2:
rectangle re=new rectangle();
re.area();
re.perimeter();
break;
default:
System.out.println("Invalid Choice");
}
}
}
