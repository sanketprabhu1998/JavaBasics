import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        String str;
        System.out.println("enter value of ch");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                str="vowel";
                break;
            case 'e':
                str="vowel";
                break;
            case 'i':
                str="vowel";
                break;
            case 'o':
                str="vowel";
                break;
            case 'u':
                str="vowel";
                break;
            default:
                str="consonant";
                break;
        }
        System.out.println("the character="+ch+" is a "+str);
    }
}