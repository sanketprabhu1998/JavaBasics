import java.util.Scanner;
import java.io.*;
class count_vowels
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        int i,cnt=0;
        s1=s1.trim();
        s1=s1+" ";
        for(i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                cnt++;
            }
        }
        System.out.println("vowels= "+cnt);
    }
}