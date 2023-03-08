import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        int ctr = 0;
        int nbr, sum;
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("-> ");
            nbr = s.nextInt();
            sum = sum_digits(nbr);
            if(is_prime(sum))
                ctr++;
        }while (nbr != 42);
        s.close();
        System.out.format("Count of coffee-request - %d", ctr);
    }

    public static boolean   is_prime(int nb)
    {
        int	x = 2;
        if (nb < 2)
            return false;
        while (x < nb)
        {
            if (nb % x == 0)
                return false;
            x++;
        }
        return true;
    }

    public static int sum_digits(int nbr)
    {
        int sum = 0;
        while(nbr != 0)
        {
            sum += nbr % 10;
            nbr /= 10;
        }
        return sum;
    }
}
