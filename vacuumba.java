
import java.util.*;
public class vacuumba{

    public static boolean zerochecker(double X, double Y){
        double epsilon = 0.00001;
//      double check= Math.sqrt(X*X + Y*Y);
        if (Math.sqrt(X*X + Y*Y)< epsilon){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int iii = 0; iii<n; iii++) {
            int m = scanner.nextInt();

            double theta=90;

            //below for angle detection
            Point point = new Point(0,0);
            for (int i =0 ; i<m; i++ ){
            	theta += scanner.nextDouble();
            	double r= scanner.nextDouble();
                point.x += r*Math.cos((theta)*(Math.PI/180));
               	point.y += r*Math.sin(theta*(Math.PI/180));                                                

      		}
       		System.out.println(point.x + " "+ point.y);

	}
	}
}
