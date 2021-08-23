class pattern13
{
    public static void main(String args[])
    {
        int i,j,k,c=0,m;
        for(i=1;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(m=c;m>=1;m--)
            {
                System.out.print(m);
            }
            c++;
            System.out.println();
        }
    }
}