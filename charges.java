import java.io.*;
import java.util.Scanner;  
class charges
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter L for laptop or D for desktop");
        char device= sc.next().charAt(0);   
        double amt,dis,tot;
        System.out.println("Enter amount");
        amt=sc.nextDouble();
        dis=0;
        if(amt>0 && amt<=25000)
        {
            if(device=='L')
            {
                dis=amt*0.05;
            }
            else
            {
                dis=0;
            }
        }
        if(amt>25000 && amt<=150000)
        {
            if(device=='L')
            {
                dis=amt*0.10;
            }
            else
            {
                dis=amt*0.05;
            }
        }
        if(amt>150000 && amt<=250000)
        {
            if(device=='L')
            {
                dis=amt*0.173;
            }
            else
            {
                dis=amt*0.10;
            }
        }
        if(amt>250000)
        {
            if(device=='L')
            {
                dis=amt*0.20;
            }
            else
            {
                dis=amt*0.173;
            }
        }
        amt=amt-dis;
        System.out.println("Discount offered="+dis);
        System.out.println("Final price="+amt);
    }
}