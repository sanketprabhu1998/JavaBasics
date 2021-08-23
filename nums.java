import java.util.Scanner;
class nums
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=1,sum=0;
        while(n<=10)
        {
            System.out.println("n="+n);
            sum=sum+n;
            n++;
        }
        System.out.println("sum of all numbers="+sum);
        System.out.println("final value of n="+n);
    }
}