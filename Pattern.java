 class starPattern {
    void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern
{
    public static void main(String args[])
    {
           starPattern sp = new starPattern();
           sp.pattern(6);
           
    }
}