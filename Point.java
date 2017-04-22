public class Point {
public double x;
public double y;

public Point(double x, double y){
    this.x=x;
    this.y=y;
}
public String toString(){
    return "("+ this.x+","+this.y+")";
}
public double distance(){
	return Math.sqrt(Math.pow(this.x , 2)+Math.pow(this.y , 2));

}

public double angle(){
	//we will use the dot product to determine the angle between unit vector (1,0) and the the 
	double theta= Math.atan(this.y/ this.x);
//	double theta2 =Math.asin(this.y/ this.distance());
//	if (this.y>0 && this.x>0){
//		return theta;	
//	}
	if (this.y>0 && this.x<0){
		return theta+Math.PI;
	}
//	if (this.y<0 && this.x>0){
//		return theta2+2*Math.PI;
//	}
	if (this.y<0 && this.x<0){
		return theta+Math.PI;
	}

	return theta;
	
}
public double anglex(){
	double theta= Math.atan((-this.y)/ (-this.x));
//	double theta2=Math.asin((-this.y)/ this.distance());
//	if (-this.y>0 && -this.x>0){
//		return theta; 
//	}	if (-this.y>0 && -this.x>0){
//		return theta;	
//	}
	if (-this.y>0 && -this.x<0){
//		
		return theta+Math.PI;
	}
//	if (-this.y<0 && -this.x>0){
//		return theta2+2*Math.PI;
//	}
	if (-this.y<0 && -this.x<0){
		return theta+Math.PI;
	}

	return theta;
	}
}
