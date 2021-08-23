import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int i,n,a=0,b=1,c;
        //System.out.println(a+" "+b);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        
    }
}