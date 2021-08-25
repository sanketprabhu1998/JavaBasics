import java.util.Scanner;
class array1
{
    public static void main(String args[])
    {
        int i;
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for(i=0;i<5;i++)
        {
            
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("element "+i+"="+a[i]);
        }
    }
}