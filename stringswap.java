import java.io.*;
import java.util.*;
class stringswap{
public static void main(String[]args){
String string1,string2,temp;
System.out.println("Enter string1");
Scanner sc=new Scanner(System.in);
string1=sc.nextLine();
System.out.println("Enter string2");
string2=sc.nextLine();
temp=string1;
string1=string2;
string2=temp;
System.out.println("After swapping string1="+string1+ "string2="+string2);
}
}
