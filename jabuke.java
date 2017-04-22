import java.util.*;
public class jabuke{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double[] x= new double[3];
	double[] y= new double[3];
	for (int i =0; i<3; i++){
		x[i]=scanner.nextDouble();
		y[i]=scanner.nextDouble();
	}
	double m_0 = (y[0]-y[1])/(x[0]-x[1]);
	double m_1 = (y[1]-y[2])/(x[1]-x[2]);
	double m_2 = (y[2]-y[0])/(x[2]-x[0]);
	double b_0 = y[0]-(m_0*x[0]);
	double b_1 = y[1]-(m_1*x[1]);
	double b_2 = y[2]-(m_2*x[2]);
	double area =area(x,y);
	System.out.println(area);
	int m = scanner.nextInt();
	int ans=0;
	double[] check1 = new double[3];
	double[] check2 = new double[3];
	for (int i =0; i<3; i++){
		check1[i]=x[i];
		check2[i]=y[i];
	}
	for (int i =0; i<m; i++){
		double count=0;
		double x_k = scanner.nextDouble();
		double y_k = scanner.nextDouble();
		for (int j=0; j<3; j++){
			check1[j]=x_k;
			check2[j]=y_k;
			count+=area(check1,check2);
			check1[j]=x[j];
			check2[j]=y[j];
		}
		if (count==area) ans++;

	}
	System.out.println(ans);
}
public static double area(double[] x, double[] y){
	return Math.abs((x[0]*(y[1]-y[2]))+(x[1]*(y[2]-y[0]))+x[2]*(y[0]-y[1]))/2;
}
}