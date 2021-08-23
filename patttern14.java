import java.lang.math.*;
class patttern14
{
    public static void main(String args[])
    {
        int i,j;
        long p;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                p=Math.pow(j,i);
                System.out.print(p);
            }
            System.out.println();
        }
    }
}