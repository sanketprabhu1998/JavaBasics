import java.util.Scanner;
class amicable_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n1,n2,sum1=0,sum2=0;
        System.out.println("Enter value for n1");
        n1=sc.nextInt();
        System.out.println("Factors of "+n1+" are");
        for(i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                sum1=sum1+i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of factors of "+n1+" is "+sum1);
        System.out.println("Enter value for n2");
        n2=sc.nextInt();
        System.out.println("Factors of "+n2+" are");
        for(i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                sum2=sum2+i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of factors of "+n2+" is "+sum2);
        if((sum1==n2) && (sum2==n1))
        {
            System.out.println(n1+" and "+n2+" are amicable numbers");
        }
        else
        {
            System.out.println(n1+" and "+n2+" are not amicable numbers");  
        }
    }
}