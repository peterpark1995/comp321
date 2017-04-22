import java.util.*;
public class Conjecture{
    public static boolean isprime(int n){
        if (n==1){
            return false;
        }


        for (int i =2 ; i <= (int) n/2 ; i++) {
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            for (int k=0; k<n ;k++){    
                int input = scanner.nextInt();      
                List<Integer> list = new ArrayList<Integer>();
                for (int i =1 ; i<= input/2 ; i+=2) {
                    if (isprime(i) && isprime(input-i)){
                        list.add(i);
                        list.add(input-i);

                    }
                    if (isprime(2) && isprime(input-2)){
                        list.add(2);
                        list.add(input-2);

                    }
                }

                System.out.println(input + " has " + list.size()/2 + " representation(s)" );
                for (int i =0; i<list.size() ; i++) {
                    System.out.println(list.get(i) +"+"+ list.get(i+1));
                    i++;
                }
                System.out.println();
        }
    }
}