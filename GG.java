import java.util.*;
public class GG{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =0;i<n ;i++ ) {
        	int m = scanner.nextInt();
        	double[] array= new double[m];
        	for (int j=0;j<m ;j++ ) {
        		double a= scanner.nextDouble();
        		double b= scanner.nextDouble();
        		double c= scanner.nextDouble();
                        if ((b/(2*a))>0){
        		      array[j]=  -a*Math.pow(b/(2*a),2)+b*(b/(2*a))+c;
                        }
                        else {
                                array[j] = c;
                        }
        	}
        	double answer=0;
        	int index=0;

        	for (int k=0; k<m ;k++){
        	       if (array[k] > answer){
        		      answer= array[k];
        		      index=k;
        	       	}                       
        	}

        	System.out.println(index+1);
        }
        scanner.close();
	}
}
