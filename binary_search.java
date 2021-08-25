import java.util.*;
class binary_search
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i,search;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search");
        search=sc.nextInt();
        int l=0,u=a.length,mid,flag=0;
        while(l<u)
        {
            mid=(l+u)/2;
            if(a[mid]<search)
            {
                l=mid+1;
            }
            else if(a[mid]>search)
            {
                u=mid-1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Search found");
        }
        else
        {
            System.out.println("Search not found");
        }
    }
}