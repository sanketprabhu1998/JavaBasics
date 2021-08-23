import java.util.Scanner;
class series3
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        double b=2,i,sum=0;
        System.out.println("b="+b);
        for(i=1;i<=n;i++)
        {
            sum=sum+i/b;
            b++;
            System.out.println("b="+b);
            System.out.println("sum="+sum);
        }
        System.out.println();
    }
}