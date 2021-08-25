import java.util.*;
class bubble_sort
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i,j,temp;
        int n=a.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(a[j-1]>a[j])
                {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Array after bubble sorting= ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}