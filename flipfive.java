import java.util.*;	
public class flipfive {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int count = scanner.nextInt();
		String[] input = new String[3];
		scanner.nextLine();
		for (int i =0; i<count; i++){
			for (int j=0; j<3; j++){
				input[j] = scanner.nextLine();
			}
			int mapped = mapper(input);
			int[] index = new int[512];
			for (int j=1 ; j<index.length; j++){
				index[j] = Integer.MAX_VALUE;
			}
			//base cases
			populate(0,index,0,0);
			System.out.println(index[mapped]);
		}
		
		
		
		scanner.close();
	}
	
	public static int mapper( String[] input){
		int output=0;
		int k =0;
		for (int j=0; j<3; j++){
			for (int i =0; i<3; i++){
				if (input[j].charAt(i)=='*'){
					output+=Math.pow(2, k);

				}
				k++;
			}
		}
		return output;
	}
	public static void populate(int input, int[] index, int count, int past_operation ){
		int[] operations = {11,23,38,89,186,308,200,464,416};
		for (int i =0; i<operations.length; i++){
			if (operations[i] != past_operation && index[input^operations[i]]>count+1){
				index[input^operations[i]]=count+1;
				populate(input^operations[i], index, count+1, operations[i]);
			}
		}
	}
	
}