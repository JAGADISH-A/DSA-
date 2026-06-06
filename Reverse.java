import java.util.*;
/*class Pattern
{
    void revPattern(int n )
    {
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = (n-1) ; j>=i ; j--)
            {
                System.out.print(" " + "*" + " ");

            }
            System.out.println();
        }
    }
}*/
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern p = new Pattern();
        p.revPattern(n);

    }
}


//approach 2 
class Pattern
{
    void revPattern(int n )
    {
        for(int i = 1 ; i<=n;i++)
        {
            for(int j = 0 ; j< (n+1)-i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}