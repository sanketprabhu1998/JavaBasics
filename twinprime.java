import java.util.Scanner;
class twinprime
{
    public static void main(String args[])
    {
        int i,l,n1,n2,f1=0,f2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=2;i<n1;i++)
        {
            if(n1%i==0)
            {
                f1=1;
                break;
            }
        }
        for(l=2;l<n2;l++)
        {
            if(n2%l==0)
            {
                f2=1;
                break;
            }
        }
        if((f1==0) && (f2==0) && Math.abs(n2-n1)==2)
        {
            System.out.println("Twin prime");
        }
        else
        {
            System.out.println("Not twin prime");
        }
    }
}