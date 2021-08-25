import java.io.*;
import java.util.Scanner;
class arrange
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        System.out.println("not arrranged="+a);
        a=a.trim();
        int i,j;
        String s2=" ";
        for(i=65;i<=90;i++)
        {
            for(j=0;j<a.length();j++)
            {
                char ch=a.charAt(j);
                if(ch==(char)i || ch==(char)(i+32))
                {
                    s2=s2+ch;
                }
            }
        }
        System.out.println("arranged letters="+s2);
    }
}