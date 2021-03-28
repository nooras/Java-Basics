package Set2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt(),digits, sum=0, rem, temp;
		digits = String.valueOf(no).length();
		temp = no;
		while(no!=0) {
			rem = no%10;
			sum += Math.pow(rem, digits);
			no = no/10;
		}
		if(temp == sum) {
			System.out.println(temp + " is a Armstrong no");
		}else {
			System.out.println(temp + " is not a Armstrong no");
		}
	}
}

/*
371
371 is a Armstrong no
----------------------
1634
1634 is a Armstrong no
----------------------
153
153 is a Armstrong no
----------------------
654
654 is not a Armstrong no

*/
