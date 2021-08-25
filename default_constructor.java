class default_constructor
{
    int a,b,c;
    default_constructor()
    {
        a=10;
        b=20;            
    }
    void add1()
    {
        c=a+b;
        System.out.println("sum="+c);
    }
  
    public static void main(String args[])
    {
        default_constructor a=new default_constructor();
        a.add1();
    }
}