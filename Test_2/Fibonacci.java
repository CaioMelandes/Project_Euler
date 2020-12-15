package Test_2;

public class Fibonacci {
    public static void main(String args[])
    {
        int total = 0, previous = 0, next = 1;

        for(; previous < 4000000;) 
        {
            int Sum = previous + next;
            previous = next;
            next = Sum;

            if(previous % 2 == 0)
            {
                total += previous;
            }
        }
        System.out.println(total);
    }
}