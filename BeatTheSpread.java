import java.util.*;
public class asss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++){
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            
            if  ((s-d)%2 != 0) System.out.println("impossible");
            else {
                int n = (s - d)/2;
                int m = s - n;
                if (m < 0 || n < 0) System.out.println("impossible");
                else System.out.println(m + " " + n);
            }
            
        }
        scanner.close();
    }
}