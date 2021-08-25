import java.io.*;
import java.util.Scanner;
class frequency_word
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine(); //string
        int a=0;
        int i;
        String s1; //word
        System.out.println("enter a word");
        s1=sc.nextLine();
        s=s.trim();
        s=s+" ";
        String s3=" " ;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(s3.equalsIgnoreCase(s1))
                {
                    a++;
                }
                s3=" ";
               // System.out.println("Encountered string is "+s3);
            }
            else
            {
                s3=s3+ch;
            }
        }
        
        System.out.println("frequency is "+a);
    }
}