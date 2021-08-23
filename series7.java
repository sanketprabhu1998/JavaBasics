import java.util.Scanner;
class series7
{
    public static void main(String args[])
    {
        double n,a,i,sum=0;
        int x=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for n");
        n=sc.nextInt();
        System.out.println("enter value for a");
        a=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+((a+i)/x);
            x=x+2;
            System.out.println(sum);
        }
        System.out.println("sum="+sum);
    }
}