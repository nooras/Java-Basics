
public class Program2MaxOutof3No {
	public static void main(String[] args) {
		// Implement your code here 
		int num1 = 3, num2 = 4, num3 = 10;
		if ((num1 > num2) && (num1 > num3)){
		    System.out.println(num1);
		}else if((num2 > num1) && (num2 > num3)){
		    System.out.println(num2);
		}else{
		    System.out.println(num3);
		}
	}
}
