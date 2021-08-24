import java.io.*;
import java.util.Scanner;
class string
{
    public static void main(String args[]) throws IOException    
    {
        Scanner s=new Scanner(System.in);
        String s1;
        int i;
        System.out.println("Enter a string");
        s1=s.nextLine();
        int a=0,b=0,c=0,d=0;
        for(i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(Character.isLetter(ch))
            {
                a++;
            }
            else if(Character.isDigit(ch))
            {
                b++;
            }
            else if(s1.charAt(i) == ' ')
            {
                c++;
            }
           
        }
        System.out.println("letters="+a);
        System.out.println("digits="+b);
        System.out.println("white spaces="+c);
        //System.out.println(d);
    }
}
    