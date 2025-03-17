import java.io.*;
import java.util.*;
public class symmetric{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows of the matrix:");
int m=sc.nextInt();
System.out.println("Enter the number of columns of the matrix:");
int n=sc.nextInt();
if(m==n)
{
int flag=0;
int [][]matrix=new int [m][n];
System.out.println("Enter the elements of matrix ");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
matrix[i][j]=sc.nextInt();
}
}
System.out.println("\nThe given matrix is:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(matrix[i][j]!=matrix[j][i])
{
flag=1;
break;
}
}
}
if(flag==0){
System.out.println("Matrix is symmetric");
}
else
{
System.out.println("Matrix is asymmetric");
}
}
sc.close();
}
}






