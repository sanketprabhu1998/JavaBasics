import java.util.Scanner;
class primorial_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,flag=0,temp=1;
        System.out.println("enter a no");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                temp=temp*i;
            }
            
        }
        System.out.println(temp);
    }
}