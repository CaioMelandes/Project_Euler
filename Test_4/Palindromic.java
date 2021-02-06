package Test_4;

/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
@Caio Melandes
*/

public class Palindromic {
    public static void main(String[] args) {

        for(int i = 100; i < 1000; i++){       
            for(int j = 100; j < 1000; j++){
                int multi = i * j;

                String str = String.valueOf(multi);

                StringBuilder reverso = new StringBuilder();
                reverso.append(str);
                reverso = reverso.reverse();
                
                if(str.equals(reverso.toString())){
                    if(str.startsWith("9")){
                        System.out.println(str);
                    }
                }
            }
        }
    }
}

