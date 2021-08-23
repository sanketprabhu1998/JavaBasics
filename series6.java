import java.util.Scanner;
class series6
{
    public static void main(String args[])
    {
        double sum=0,i,a,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for numerator");
        a=sc.nextInt();
        System.out.println("enter number of items");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(a+i)/n;
            n=n+2;
        }
        System.out.println("sum="+sum);
    }
}