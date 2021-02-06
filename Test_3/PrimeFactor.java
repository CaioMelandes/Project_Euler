package Test_3;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
@Caio Melandes
*/

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