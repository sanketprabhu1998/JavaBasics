import java.util.Scanner;
class sum_of_nos
{
    public static void main(String args[])
    {
        int a,sum=0,n=1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(n<=a)
        {
            sum=sum+n;
            n++;
        }
        System.out.println("sum of nos. upto "+a+"="+sum);
    }
}