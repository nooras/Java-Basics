package DayFiveExercise;

class Point {
    //Implement your code here
	private double xCoordinate;
	private double yCoordinate;
	
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Point(double xCoordinate , double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance() {
		double d = Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2);
		return  (double) (Math.round(Math.sqrt(d)*100))/100;
	}
	
	public double calculateDistance(Point point) {
		double d = Math.pow(xCoordinate - point.xCoordinate, 2) + Math.pow(yCoordinate-point.yCoordinate, 2);
		return  (double) (Math.round(Math.sqrt(d)*100))/100;
	}


}


public class MethodOverLoadingExercise1 {
	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
