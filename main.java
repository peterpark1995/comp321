import java.util.*;
import java.math.*;
public class main{

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Point point = new Point(0,0);
		for (int iii = 0; iii<n; iii++) {
			//let the turtle be at 0 degree with the x-axis
			int magnitude = 0;
			int angle = 0;
			String command_n = null;
			int angle_n = 0;
			for (int jjj = 0 ; jjj<m ; jjj++){
				String command = scanner.next();
				int indicator =0;
				if ((scanner.hasNextInt())){
					magnitude = scanner.nextInt();
				}
				
				else{
					command_n = command;
					magnitude =0;
					scanner.next();
					indicator++;
					angle_n=angle;
				}

				
				if (command.charAt(0) =='l' && indicator ==0 ){
					angle += magnitude;
				}
				if (command.charAt(0) == 'f' & indicator ==0){
					point.x += magnitude*Math.cos(angle*(Math.PI/180));
					point.y += magnitude*Math.sin(angle*(Math.PI/180));
	
				}
				if (command.charAt(0) =='r' && indicator ==0 ){
					angle -= magnitude;
				}
				if (command.charAt(0) == 'b' & indicator ==0){
					point.x -= magnitude*Math.cos(angle*(Math.PI/180));
					point.y -= magnitude*Math.sin(angle*(Math.PI/180));
	
				}
				if (indicator != 0){
					indicator--;
				}

				

		}
		point.x =  0.000001 *(Math.round(point.x * 1000000.0));
		point.y = 0.000001 *(Math.round(point.y * 1000000.0));
		if(command_n != null){
			if (command_n.charAt(0) == 'f'){
				System.out.println( (int) (0.000001 *(Math.round(point.distance() * 1000000.0))));
			}
			else if(command_n.charAt(0) == 'b'){
				System.out.println( (int) (0.000001 *(Math.round(point.distance() * 1000000.0))));
			}
			else
			{
				point.x -= magnitude*Math.cos(angle_n*(Math.PI/180));
				point.y -= magnitude*Math.sin(angle_n*(Math.PI/180));
				double check = point.anglex()*(180/Math.PI);
				
				System.out.println( (int) (0.000001 *(Math.round((((point.anglex()*(180/Math.PI))-angle_n))*1000000.0))));
			}
		}
		scanner.close();
	}
}
}