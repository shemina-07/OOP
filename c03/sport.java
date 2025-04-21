import java.io.*;
import java.util.*;
class student
{
String name="Hana";
}
class sports extends student
{
String sportName="Football";
}
class result extends sports
{
String sportScore="Second";
String academicScore="A+";
void display()
{
System.out.println("Student Name:" + name);
System.out.println("Sports Name:" + sportName);
System.out.println("Sports Score:" + sportScore);
System.out.println("Academic Score:" + academicScore);
}
}
class sport
{
public static void main(String args[])
{
result r=new result();
r.display();
}
}
