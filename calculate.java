import java.util.Scanner;
import java.io.*;
class calculate
{
    public static void main(String args[]) throws IOException
    {
        int a,b,cal,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        cal=0;
        System.out.println("enter value for choice 1-add, 2-subtract, 3-multiply, 4-divide");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                cal=a+b;
                break;
            case 2:
                cal=a-b;
                break;
            case 3:
                cal=a*b;
                break;
            case 4:
             cal=a/b;
                break;
            default:
                System.out.println("wrong");
                break;
       }
       System.out.println("calculation="+cal);
    }
}