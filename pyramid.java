import java.util.*;
class pattern 

{
    int i;
    int j ; 
    void pattern(int n)
    {
        for( i=0 ; i<n ; i++)
        {
            for( j = 0 ; j<(n-1-i) ; j++)
            {
                System.out.print(" ");

            }
            for( j = 0 ; j < ((2*i)+1) ; j++)
            {
                System.out.print("*");
            }
            for(j = 0 ; j<(n-1-i) ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class pyramid 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern p = new pattern();
        p.pattern(n);
    }
}