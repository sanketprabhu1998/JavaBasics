import java.util.*;
class selection_sort
{
    public static void main(String args[])
    {
        int i,j,small=0,pos=0,temp;
        int a[]=new int[5];
        int n=a.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            small=a[i];
            pos=i;
            for(j=i+1;j<5;j++)
            {
                if(small>a[j])
                {
                    small=a[j];
                    pos=j;
                }
            }
            temp=a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
        System.out.println("after selection sort");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}