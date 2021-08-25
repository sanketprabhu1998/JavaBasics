import java.util.*;
class merge_array
{
    public static void main(String args[])
    {
        int i;
        int p[] = new int[6];
        int q[]=new int[4];
        int r[]=new int [5];
        int s[]=new int[15];
        Scanner sc = new Scanner(System.in);
        int p1,q1,r1,s1;
        p1=p.length;
        q1=q.length;
        r1=r.length;
        System.out.println("enter the elements of p");
        for(i=0;i<p1;i++)
        {
            p[i]=sc.nextInt();
            s[i]=p[i];
        }
        System.out.println("enter the elements of q");
        for(i=0;i<q1;i++)
        {
            q[i]=sc.nextInt();
            s[p1+i]=q[i];
        }
        System.out.println("enter the elements of r");
        for(i=0;i<r1;i++)
        {
            r[i]=sc.nextInt();
            s[p1+q1+i]=r[i];
        }
        s1=s.length;
        System.out.println("Merger of p , q, and r arrays is: ");
        for(i=0;i<s1;i++)
        {
            System.out.println(s[i]);
        }
    }
}