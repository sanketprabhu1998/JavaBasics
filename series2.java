import java.util.Scanner;
class series2
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       double sum=0,n,i,a=1;
       System.out.println("Enter value of n");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
           sum=sum+(1/a);
           a=a+2;
       }
       System.out.println(sum);
   }
}