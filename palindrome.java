import java.io.*;
import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,n1,rev=0,d;
    System.out.println("enter a number");
    n=sc.nextInt();
    n1=n;
    while(n!=0)
    {
        d=n%10;
        rev=rev*10+d;
        n=n/10;
    }
    if(rev==n1)
    {
        System.out.println(n1+" is a palindrome number");
    }
    else
    {
        System.out.println(n1+" is not a palindrome number");
    }
}
}