import java.util.Scanner;
class nums2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,n,tab;
        System.out.println("Enter value of n");
        n=sc.nextInt();
        a=1;
        while(a<=10)
        {
        tab=a*n;
        System.out.println(n+"*"+a+"="+tab);
        a++;
        }
    }
}