import java.io.*;
import java.util.Scanner;
class func2
{   
    int pan;
    String name;
    double tax,ti;
   
    void input() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, pan number,taxable income");
        pan=sc.nextInt();
        name=sc.nextLine();
        ti=sc.nextDouble();
    }
    
    void calc()
    {
        if(ti<=100000)
        {
            tax=0;
        }
        else if(ti>100000 && ti<=250000)
        {
            tax=5000+(0.20*ti);
        }
        else
        {
            tax=250000+(0.30*ti);
        }
    }
    void display()
    {
        System.out.println("name="+name);
        System.out.println("income="+ti);
        System.out.println("pan no="+pan);
        System.out.println("tax="+tax);
    }
    
    void main() throws IOException
    {
        input();
        calc();
        display();
    }
}
