import java.io.*;
import java.util.Scanner;
class swap2
{
    static void swap1(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("Swapping values:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Inputs are");
        System.out.println("a="+n1);
        System.out.println("b="+n2);
        swap1(n1,n2);
    }
}