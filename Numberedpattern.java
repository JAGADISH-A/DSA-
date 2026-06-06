import java.util.*;
class pattern
{
    void numberedPattern(int n)
    {
        for(int i = 1 ; i<=n; i ++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
public class Numberedpattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern p = new pattern();
        p.numberedPattern(n);
 
    }
}