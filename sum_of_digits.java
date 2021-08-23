import java.util.Scanner;
class sum_of_digits
{
    public static void main(String args[])
    {
        int n1,n,sum=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for n");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("sum of digits in "+n1+"="+sum);
    }
}