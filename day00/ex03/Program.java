import java.util.*;

public class Program
{
    private static final String WEEK = "Week ";
    private static final int MIN = Integer.MAX_VALUE;

    public static void main(String[] args)
    {
        String str;
        int weekNumb = 1;
        int minGrade;
        int[] arr = new int[18];

        Scanner s = new Scanner(System.in);
        do{
            System.out.print("-> ");
            str = s.nextLine();
            if(!str.equals(WEEK+weekNumb) && !str.equals("42"))
            {
                System.err.println("Illegal Argument");
                System.exit(-1);
            }
            else if(str.equals(WEEK+weekNumb))
            {
                minGrade = getMin(s);
                arr[weekNumb-1] = minGrade;
                weekNumb++;
            }
        }while (!str.equals("42"));
        displayGraph(arr);
        s.close();
    }

    static int getMin(Scanner sc)
    {
        int min = MIN;
        int grade;
        for(int i = 0; i < 5; i++)
        {
            grade = sc.nextInt();
            if(grade < min)
                min = grade;
        }
        sc.nextLine();//enter
        return min;
    }

    static void displayGraph(int arr[])
    {
        int j;
        int i = 0;
        while(arr[i] != 0)
        {
            j = 0;
            int amount = arr[i];
            System.out.print(WEEK+(i+1)+" ");
            while(j < amount)
            {
                System.out.print("=");
                j++;
            }
            i++;
            System.out.print(">\n");
        }
    }
}
