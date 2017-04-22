import java.util.*;

class node{
	int starting;
	int has_parent;
	int nodes;
	Vector children = new Vector();
}
public class marbles {
	
 public static void main(String []args) {
	 int N = 10100;
	 node[] Tree = new node[N];
	 for(int i=0;i< N;i++) {
		 Tree[i] = new node();
	 }
		
	 Scanner scanner = new Scanner(System.in);
	
	 while(scanner.hasNext()){
		 int n = scanner.nextInt();
		 if(n==0) break;
		 for(int i=0;i<=n;i++){
			 Tree[i].starting = -1;
			 Tree[i].children.clear();
			 //vector clear
			 Tree[i].nodes = 0;
			 //reset tree
		 }
	for(int i=0; i< n;i++){
		int index = scanner.nextInt();
		Tree[index].starting = scanner.nextInt();
		//starting number
		int number_of_nodes = scanner.nextInt();
		//number of nodes 
		for(int j=0;j<number_of_nodes;j++){
			int child = scanner.nextInt();
			Tree[index].children.add(child);
			Tree[child].has_parent = -2;
			//-2 if has parent
		}
	}
	//default root
	int root = 1;
	for(int i=0;i<n;++i) {
		if(Tree[i].has_parent==-1){
			root = i;
			//if still negative one then true since if children of a node it will be -2
		}
	}
	int answer=dfs(Tree,root);
	System.out.println(answer);
   }
	 scanner.close();
 }

public static int dfs(node Tree[],int root){
	int answer=0;
	Tree[root].has_parent = Tree[root].starting;
	Tree[root].nodes = 1;
	for(int i=0;i< Tree[root].children.size();i++){
		int k = (int) Tree[root].children.get(i);
		if(Tree[k].has_parent< 0){
			answer+=dfs(Tree,k);
			Tree[root].has_parent+=Tree[k].has_parent;
			Tree[root].nodes+=Tree[k].nodes;
			answer+=Math.abs(Tree[k].has_parent-Tree[k].nodes);
		}
	}
	return answer;
	}

}