import java.util.Scanner;
class pattern
{
    void numberedPatter(int n )
    {
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(" " +i+ " ");
            }
            System.out.println();
        }
    }
}

public class Numberedpattern1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern p = new pattern();
        p.numberedPatter(n);

    }
    
}
