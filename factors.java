import java.util.Scanner;
class factors
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        System.out.println("factors of"+n+"=");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}