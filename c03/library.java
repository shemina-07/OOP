import java.io.*;
import java.util.*;
class publisher
{
String name="Darjoy Dhatha";
}
class book extends publisher
{
String bookName="It Starts With Us";

}
class literature extends book
{
String type="literature";
}
class fiction extends book
{
String type="Fiction";
}
class library
{
public static void main(String args[])
{
literature lb=new literature();
fiction fb=new fiction();
System.out.println("Fiction book details :");
System.out.println("Publisher: " + fb.name + " | name is : " + fb.bookName + " | type is : " +fb.type);
System.out.println("Literature book details :");
System.out.println("Publisher: " + lb.name + " | name is : " + lb.bookName + " | type is : " + lb.type);
}
}
