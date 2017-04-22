import java.util.*;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;


public class ICGtDS{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int[] array = new int[3];
		array[0]=array[1]=array[2]=0;
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
			String q = "";
			String s = "";
			int j =0;
			String pq = "";
			boolean s_boolean = false;
			boolean q_boolean = false;
			boolean p_boolean = false;
			for (int i =0 ;i<input1 ;i++ ){
				String a = sc.nextLine();

				if (a.length() >1){
				if (a.charAt(0) - 48 == 1){
					list.add(Integer.valueOf(a.substring(2)));
					q= q + a.substring(2);
					s = a.substring(2) + s;
				}
				if (s.length() == 0 && q.length() == 0 && pq.length() == 0){
						s_boolean=q_boolean=p_boolean=true;
				}
					if (a.charAt(0)-48 == 2){
						string1 = string1 + a.substring(2);
						j++;
					//	System.out.println(list);
						Collections.sort(list);
						Collections.reverse(list);
						pq =list.toString().replaceAll("\\[|\\]","").replaceAll(", ","");
						//System.out.print(a.charAt(2)-48);
						if(s.length()!=0){
							if ((int) (a.charAt(2)-48) != (int) (s.charAt(0))-48){
								s_boolean=true;
							//System.out.println(s.charAt(0));							}
							}
							s=s.substring(1);
	//					System.out.println(s);
	//					System.out.println(q);
	//					System.out.println(pq);
						if(q.length()!=0){
							if((int) (a.charAt(2)-48) != (int) (q.charAt(0)-48)){
								q_boolean=true;
							}
							q=q.substring(1);	
	//					if((int) (a.charAt(2)-48) != (int) (pq.charAt(0)-48)){
	//						p_boolean=true;
							//System.out.println(pq.charAt(0));
						}
						}	//					System.out.println(s);
	//					System.out.println(q);
	//					System.out.println(pq);				
					}
				}
				else{
					break;
				}	
			}
			System.out.println(pq);
			System.out.println(string1);
			if (!s_boolean){
				array[0] = 1;
			}
			if (!q_boolean){
				array[1] = 1;
			}

			if (pq.startsWith(string1)){
				array[2] = 1;
			}
			int sums =array[0] + array[1] +array[2];
		//	for (int i=0; i<array.length ; i++) {
		//		System.out.println(array[i]);
		//	}
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