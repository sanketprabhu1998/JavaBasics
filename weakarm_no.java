import java.lang.Math;
import java.util.Scanner;
class weakarm_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,n2,d,count=0;
        double sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        n1=n;
        n2=n;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        while(n1!=0)
        {
            d=n1%10;
            sum=sum+(Math.pow(d,count));
            count--;
            n1=n1/10;
        }
        if(n2==sum)
        {
            System.out.println("Weakarm no.");
        }
        else
        {
            System.out.println("Not weakarm no.");    
        }
    }
    
}