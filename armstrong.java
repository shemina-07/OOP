import java.io.*;
import java.util.*;
class armstrong{
public static void main(String[]args){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
int originalNumber=n;
int sum=0;
while(n!=0){
int digit=n%10;
sum+=digit*digit*digit;
n/=10;

}
if(sum==originalNumber){
System.out.println(originalNumber+ "is an armstrong number");}
else{
System.out.println(originalNumber+ "is  not an armstrong number");
}
}
}

