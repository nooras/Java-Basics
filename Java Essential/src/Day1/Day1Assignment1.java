package Day1;

import java.util.Scanner;

public class Day1Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b ,c , discriminant;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		discriminant = b*b - 4*a*c;
		//Math.pow(a, b)
		
		/*
		 if discriminant is equal to 0 then root will same display the value of root
		 if discriminant > 0 display the unequl root
		 if discriminant < 0 no real roots
		 */
		if(discriminant == 0) {
			System.out.println("The root is " + (-b)/(2*a));
		}else if (discriminant > 0) {
			System.out.println("The root1 is " + (-b+Math.sqrt(discriminant))/(2*a));
			System.out.println("The root2 is " + (-b-Math.sqrt(discriminant))/(2*a));
		}else {
			System.out.println("The equation has no real root");
		}
		sc.close();
	}
}
