import java.util.*;
class shapes
{
public void areas(float radius)
{
double area=Math.PI*radius*radius;
System.out.println("Area of circle is :" +area);
}
public void areas(int side)
{
int area=side*side;
System.out.println("Area of square is :" +area);
}

public void areas(int length,int breadth)
{
int area=length*breadth;
System.out.println("Area of Rectangle is :" +area);
}
}
class overloading
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
shapes sh=new shapes();
System.out.println("Enter the choice : 1.Circle, 2.Square, 3.Rectangle");
int n=sc.nextInt();
switch(n)
{
case 1:System.out.println("Enter the Radius :");
float r=sc.nextFloat();
sh.areas(r);
break;
case 2:System.out.println("Enter the side of the Square :");
int s=sc.nextInt();
sh.areas(s);
break;
case 3:System.out.println("Enter the length of the Rectangle :");
int l=sc.nextInt();
System.out.println("Enter the breadth of the Rectangle :");
int b=sc.nextInt();
sh.areas(l,b);
break;
default : System.out.println("Invalid Choice");
}
}
}
