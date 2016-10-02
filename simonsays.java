import java.util.*;
import java.util.Scanner;

public class simonsays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i =0 ; i <= number; i++){
			String a = sc.nextLine();
			if(a.contains("Simon says")){
				System.out.println(a.substring(10));
			}
		}
		sc.close();

	}
}