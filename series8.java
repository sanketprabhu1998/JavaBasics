import java.util.Scanner;
class series8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n,i,sum=0,x,a;
        System.out.println("enter value of n and a");
        n=sc.nextInt();
        a=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            x=Math.pow(a,i);
            sum=sum+(i/x);
            System.out.println(sum);
        }
        System.out.println("sum="+sum);
    }
}