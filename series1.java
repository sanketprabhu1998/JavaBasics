class series1
{
    public static void main(String args[])
    {
    int n,i;
    int sum=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        sum=sum+1/i;
        System.out.println(sum);
    }
}