//Sum of 2 numbers if number is same else display the double of sum
package Set1;

import java.util.Scanner;

public class SumOf2NumberDoubleofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total;
		if(num1 == num2) {
			total = num1 + num2;
		}else {
			total = (num1 + num2)*2;
		}
		System.out.println(total);
	}
}

/*
Output:
6
5
22
------
5
5
10
 */
