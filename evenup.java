import java.util.*;
public class even {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack stack = new Stack();
        int[] a= new int[n];
        
        for (int i =0; i<n; i++){
            a[i]=scanner.nextInt();
        }
        
        for (int i =0 ; i <n; i++){
            if (stack.isEmpty()){
                stack.push(a[i]);
            }
            else if (((int) stack.peek() +a[i] )%2 ==0 ){
                stack.pop();
            }
            else {
                stack.push(a[i]);
            }
        }

        System.out.print(stack.size());
    }
}