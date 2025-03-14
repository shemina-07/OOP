import java.io.*;
import java.util.*;
class reverse{
public static void main(String[] args){
int n,reverse,digit;
reverse=0;

System.out.println("Enter n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0){
digit=n%10;
reversedNum=(reverse*10)+digit;
n=n/10;
