import java.io.*;
import java.util.*;
class hashmap
{
public static void main(String args[])
{
HashMap<String,Integer> map=new HashMap<>();
map.put("Germany",4);
map.put("England",1);
map.put("Brazil",5);
System.out.println("Size of map is :"+map.size());
System.out.println(map);
if(map.containsKey("England"))
{
Integer a=map.get("England");
System.out.println("Value for key"+ "\"England\"is:-"+a);
}
}
}
