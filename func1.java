import java.util.Scanner;
import java.io.IOException;
class func1
{
    int sum;
    void add(int c,int d)
        {
        sum=c+d;
        System.out.println("sum="+sum);
        }   
    public static void main(String args[]) 
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        a=sc.nextInt();
        
        System.out.println("Enter value of b");
        b=sc.nextInt();
        
        func1 ob=new func1();
        ob.add(a,b);
        
    }   
}

