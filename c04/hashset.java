import java.util.*;
class hashset
{
public static void main(String args[])
{
int n,i;
String str;
HashSet<String>set1=new HashSet<String>();
System.out.println("Hashset 1");
System.out.println("Enter number of countries:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the name of Countries:");
Scanner sc1=new Scanner(System.in);
for(i=0;i<n;i++)
{
str=sc1.nextLine();
set1.add(str);
}
System.out.println("Hashset 2");
HashSet<String>set2=new HashSet<String>();
System.out.println("Enter number of countries:");
n=sc.nextInt();
System.out.println("Enter the name of Countries:");
for(i=0;i<n;i++)
{
str=sc1.nextLine();
set2.add(str);
}
System.out.println("Set 1"+set1);
System.out.println("Set 2"+set2);
HashSet<String> a=new HashSet<String>(set1);
a.addAll(set2);
System.out.println("Union of country set:"+a);
HashSet<String> b=new HashSet<String>(set1);
b.retainAll(set2);
System.out.println("Intersection of country set:"+b);
HashSet<String> c=new HashSet<String>(set1);
c.removeAll(set2);
System.out.println("Difference of country set:"+c);
}
}



