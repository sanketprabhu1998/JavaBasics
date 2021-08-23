import java.util.Scanner;
class series4
{
    public static void main(String args[])
    {
        double n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double i,j,fact=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            sum=sum+(1/fact);
        }
        System.out.println("sum="+sum);
    }
}