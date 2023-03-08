public class Program
{
    public static void main(String[] args)
    {
        int sum = 0;
        int nbr = 479598;

        while(nbr != 0)
        {
            sum += nbr % 10;
            nbr/= 10;
        }

        System.out.println(sum);
    }
}
