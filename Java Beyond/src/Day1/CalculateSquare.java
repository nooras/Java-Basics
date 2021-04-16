package Day1;

@FunctionalInterface   // make sure there will beonly 1 abstract method in interface
public interface CalculateSquare {
	
	// build in interface method
	public double square(int a);
	
	//parameterless functional interface
//		public double square();
}
