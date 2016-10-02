import java.util.*;
import java.util.Arrays;



public class ICGtDS{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int[] array = new int[3];
		int input1 = sc.nextInt();
		int x=0;
		sc.nextLine();
		while(sc.hasNextLine()){
			if (x>0){
				input1=sc.nextInt();
				sc.nextLine();
			}
			x++;
			String string1 = "";
			int j =0;
			for (int i =0 ;i<input1 ;i++ ) {
				String a = sc.nextLine();
				if (a.length() >1){
					if (a.charAt(0) - 48 == 1){

						list.add(a.charAt(2)-48);
					}
					if (a.charAt(0)-48 == 2){
						string1 = string1 + a.charAt(2);
						j++;
					}
				}
				else{
					break;
				}	
			}
			//pq in reverse
			String q = "";
			String s = "";
			for (int i =0; i < list.size() ; i++){
				q = q + list.get(i);
				s = s + list.get(list.size() -i-1);
			}
			Collections.sort(list);
			Collections.reverse(list);
			String pq =list.toString().replaceAll("\\[|\\]", "").replaceAll(", ","");

			if (s.contains(string1)){
				array[0] = 1;
			}
			if (q.contains(string1)){
				array[1] = 1;
			}
			if (pq.contains(string1)){
				array[2] = 1;
			}
			int sums =array[0] + array[1] +array[2];
			if (sums >1){
				System.out.println("not sure");
			}
			else if (sums == 0) {
				System.out.println("impossible");				
			}
			else if (array[0] ==1 && sums ==1) {
				System.out.println("stack");
			}
			else if (array[1] ==1 && sums ==1) {
				System.out.println("queue");
			}
			else if (array[2] ==1 && sums ==1){
				System.out.println("priority queue");
			}
			list.clear();
			array[0]=array[1]=array[2]=0;
		}
		sc.close();
	}

	
}