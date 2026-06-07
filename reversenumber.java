import java.util.*;
/*class pattern
{
    void pattern(int n)
    {
        for(int i = 0 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=(n-i) ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/
public class reversenumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern p = new pattern();
        p.pattern(n);
        
    }
}
class pattern
{
    void pattern(int n)
    {
        for(int i=1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <=(n+1)-i  ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}