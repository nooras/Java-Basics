package Set2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(), rem, rev = 0, temp;
		temp = number;
		while(number != 0) {
			rem = number%10;
			rev = rev*10 + rem;
			number = number/10;
		}
		if(temp == rev) {
			System.out.println(temp + " is a palindrome");
		}else
			System.out.println(temp + " is not a palindrome");
	}
}
/*
121
121 is a palindrome
-------------------
46763
46763 is not a palindrome
*/
