package comp321;
import java.util.Scanner;
import java.math.BigInteger;

public class ones {

    public static void main(String[] args) {
        BigInteger zero = new BigInteger("0");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            BigInteger mult = new BigInteger("1");

            int n  = scanner.nextInt();
            int counter=1   ;
            while(!mult.mod(new BigInteger(Integer.toString(n))).equals(zero)){             
                counter++;
                mult = mult.multiply(new BigInteger("10")).add(new BigInteger("1"));            
            }
            System.out.println(counter);

        }
        scanner.close();
    }
}