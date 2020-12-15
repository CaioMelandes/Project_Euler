package Test_3;

public class PrimeFactor 
{
    public static void main(String[] args) 
    {
        long number = 30000000L;

        while (number % 2 == 0) { 
            System.out.println(number + "---->" + 2); 
            number /= 2; 
        } 

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            
            while(number % i == 0)
            {
                System.out.println(number + "---->" + i);
                number /= i;
            }
        }
        System.out.println(number + "---->" + number);
    }
}