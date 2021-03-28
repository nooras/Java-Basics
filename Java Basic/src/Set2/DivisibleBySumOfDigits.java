//pending
package Set2;

import java.util.Scanner;

public class DivisibleBySumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt(), val, total = 0;
		String temp;
		String x = String.valueOf(no);
		for(int i=0; i<x.length();i++) {
			temp = String.valueOf(x.charAt(i)); //temp = x.charAt(i) + "";			
			val = Integer.parseInt(temp);
			total += val;
		}
		if(no%total == 0) {
			System.out.println(no + " is divisible by sum of its digits");
		}else {
			System.out.println(no + " is not divisible by sum of its digits");
		}
		
		sc.close();
	}
}

/*
Output:
2250
2250 is divisible by sum of its digits
------------------------------------
123
123 is not divisible by sum of its digits		
*/
