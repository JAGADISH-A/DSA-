/*

*
**
***
****
*****

*/
import java.util.*;
class Slidingpattern
{
    void slidingpattern(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
public class Pattern1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Slidingpattern sp = new Slidingpattern();
        sp.slidingpattern(n);
    }
}