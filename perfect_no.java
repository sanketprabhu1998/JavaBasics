import java.util.Scanner;
class perfect_no
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
        System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
    }
}