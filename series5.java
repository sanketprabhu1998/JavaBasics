import java.util.Scanner;
class series5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n,f,i,j,sum=0,sum1=0,total;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1;j<=n;j++)
            {
                f=f*j;
            }
            if(i%2==0)
            {
                sum=sum+(1/f);
            }
            else
            {
                sum1=sum+(1/f);
            }
            total=sum+sum1;
        }
        System.out.println("sum="+sum);
    }
}