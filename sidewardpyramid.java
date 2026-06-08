import java.util.*;
class pyramid 
{
    int i;
    int j;
    void pattern(int n)
    {
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class sidewardpyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid  p = new pyramid();
        p.pattern(n);
    }
}