import java.io.*;
import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,sum0=0,sum1,d;
        System.out.println("Enter a number");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
        d=n%10;
        sum0=sum0+d*d*d;
        n=n/10;
    }
        if(sum0==n1)
    {
        System.out.println(n1+" is an armstrong no.");
    }
    else
    {
        System.out.println(n1+" is not an armstrong no.");
    }
    }
    
}
