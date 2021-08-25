import java.util.*;
class linear_search
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        int i,search,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        search=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                flag=1;
                System.out.println(search + " is found at location "+ i);
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}