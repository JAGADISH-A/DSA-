import java.util.*;
class pattern {

    int i;
    int j;
    void pattern(int n )
    {
        for(i = 0 ; i<n ; i++)
        {
            for(j = 0 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(j=0 ; j<((n*2)-(i*2+1)) ; j++)//9 , 7,
            {
                System.out.print("*");
            }
            for(j = 0 ; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }  
}
public class invertedpattern
{
    public static void main(String args[])
    {
        pattern p = new pattern();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern(n);

    }
}