package Test_1;

public class Multiples
{
    public static void main(String[] args)
    {
        int Sum = 0;

        for(int i = 1; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                Sum += i;
                System.out.println(i);
            }
        }

        System.out.println(Sum);
    }
}