import java.util.Scanner;
class reverse_of_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n,rev=0,d;
        System.out.println("enter number");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("reverse of a number="+n1+"is ="+rev);
    }
}