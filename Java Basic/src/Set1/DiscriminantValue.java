package Set1;

import java.util.*;

public class DiscriminantValue {
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
			System.out.println("The root is " + (-b+discriminant)/(2*a));
		}else if (discriminant > 0) {
			System.out.println("The root1 is " + (-b+discriminant)/(2*a));
			System.out.println("The root2 is " + (-b-discriminant)/(2*a));
		}else {
			System.out.println("The euation has no real root");
		}
	}
}

/*
Output:
1
4
4
The root is -2
--------------
1
-5
2
The root1 is 11
The root2 is -6
--------------
1
4
6
The euation has no real root
*/
