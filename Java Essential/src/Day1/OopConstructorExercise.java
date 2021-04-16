package Day1;

class Point {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Method to obtain distance of a point w.r.t origin
	public double distance(){
		double d = Math.pow(x, 2) + Math.pow(y, 2);
		return  Math.sqrt(d);
	    //code here
	}
	
	//Method to obtain distance of a point w.r.t another point
	public double distance(Point point){
	    //code here
		double d = Math.pow(x - point.x, 2) + Math.pow(y-point.y, 2);
		return  Math.sqrt(d);
	}

}
class OopConstructorExercise {
	public static void main(String[] args) {
	    //code here
		Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 6);
        
        System.out.println("Distance of point1 from origin is "+point1.distance());
        System.out.println("Distance of point1 from point2 is "+point1.distance(point2));
    		
	}
}