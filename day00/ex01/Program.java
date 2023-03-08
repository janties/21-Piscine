import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int nbr;
        System.out.println("Enter a number: ");
        nbr = s.nextInt();

        if (nbr < 0 || nbr <= 2)
        {
            System.err.format("%d\n%s", nbr, "Illegal Argument");
            System.exit(-1);// ?
        }
        int i = 2;
        while(i <= Math.sqrt(nbr))
        {
            if (nbr % i == 0)
            {
                System.out.format("%d\n%b %d", nbr, false, i - 1);
                System.exit(-1);
            }
            i++;
        }
        System.out.format("%d\n%b %d", nbr, true, i - 1);
        s.close();
    }
}

