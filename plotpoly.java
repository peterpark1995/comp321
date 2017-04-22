import java.util.*;
public class main {
     public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt()+1;
            int[] array= new int[n];
            for (int i =0;i<n;i++){
                array[i]= scanner.nextInt();
            }

            //array initializer
            int[][] grid = new int[n][n];
            for (int i =0; i<n; i++){
                grid[i][0]=function(array,i);
            }
            for (int j=1; j<n ; j++){
                for (int i =0; i+j<n; i++){
                    grid[i][j]=grid[i+1][j-1]-grid[i][j-1]; 
                }
            }
            for (int i =0; i<n; i++){
                System.out.print(grid[0][i] + " ");
                
            }
            
            

     }
     public static int function(int[] a , int b){
         int ans=0;
         for (int i=0; i< a.length ;i++){
             ans+=a[i]*Math.pow(b,a.length-i-1);
         }
         return ans;
     }
}