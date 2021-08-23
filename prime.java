import java.io.*;
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,i,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            System.out.println(n+" is a prime number");
        }
    }
}
