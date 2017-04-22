import java.util.Scanner;

public class ones {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n  = scanner.nextInt();
			long counter =(long) Math.ceil(Math.log((double) n));
			long mult = 1;
			for (int i = 1; i < counter; i++) mult = mult*10 +1;
			if (n == 1) System.out.println(1);
			else{
				while(true){
					
					if (mult % n == 0){
						System.out.println(counter);
						break;
					}
					else {
						double a= Math.ceil(Math.log((double) mult));
						counter++;
						System.out.println(mult);
						mult= (long) (Math.pow((double) mult,a)  + (double) mult);
					}
					
				}
			}		
		}
		scanner.close();
	}
}