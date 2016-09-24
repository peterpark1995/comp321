import java.util.*;

public class easiest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i =0;
		Queue<Integer> queue = new LinkedList<Integer>();
		while (input !=0){
			int a=foo(input);
			queue.add(a);
			i++;
			if (i !=0){
				input = sc.nextInt();
			}
		}
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}

	public static int foo(int N){
		if (N==0){
			return 0;
		}
		int s = (int) Math.floor(Math.log10(N));
		int a=0;
		int product;
		int sum_of_digits_N=0;

		for (int j =0; j <= s; j++) {
			sum_of_digits_N+=(N%(Math.pow(10,j+1)) - (N%(Math.pow(10,j))))/Math.pow(10,j);
		}
//Use wikipedia digit sum formula
		for (int i =11; true ; i++) {
			product=i*N;
			for (int j =0; j <= (int) Math.floor(Math.log10(product)); j++ ) {
				a+=(product%(Math.pow(10,j+1)) - (product%(Math.pow(10,j))))/Math.pow(10,j);
			}
			if ( a== sum_of_digits_N){
				return i;
			}
			a=0;
		}

	}
}
