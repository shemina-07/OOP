import java.io.*;
import java.util.*;
class reverse{
public static void main(String[]args){
int n,digit;

Scanner sc=new Scanner (System.in);
System.out.println("enter a number");
n=sc.nextInt();
int reversedNum=0;
while(n!=0){
digit=n%10;
 reversedNum=(reversedNum*10)+digit;
n/=10;
}
System.out.println("reversed number is"+reversedNum);

}
}

