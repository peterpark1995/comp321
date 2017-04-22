import java.util.*;
public class main{

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
            String[] myList= new String[1000];
            String[] numbers = new String[1000];
            //let the turtle be at 0 degree with the x-axis

            int angle_n=0;
            for (int kkk = 0 ; kkk<m; kkk++){
                myList[kkk]= scanner.next();
                numbers[kkk]= scanner.next();
            }

            //below for angle detection
            Point point = new Point(0,0);
            angle_n=0;
                for (int i =0 ; i<m; i++ ){
                    if (myList[i].charAt(0) == 'f' ){
                        point.x += Integer.parseInt(numbers[i])*Math.cos((angle_n)*(Math.PI/180));
                        point.y += Integer.parseInt(numbers[i])*Math.sin(angle_n*(Math.PI/180));                                                
                    }
                    else if (myList[i].charAt(0) == 'b' ){
                        point.x -= Integer.parseInt(numbers[i])*Math.cos((angle_n)*(Math.PI/180));
                        point.y -= Integer.parseInt(numbers[i])*Math.sin(angle_n*(Math.PI/180));
                        
                    }
                    else if (myList[i].charAt(0) == 'l'){
                        angle_n += Integer.parseInt(numbers[i]);

                    }
                    else if (myList[i].charAt(0) == 'r'){
                        angle_n -= Integer.parseInt(numbers[i]);
                    }
                }
                System.out.println(Math.round(point.distance()));

        }
        scanner.close();
}
}