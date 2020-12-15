package Test_4;

public class Palindrome {
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

