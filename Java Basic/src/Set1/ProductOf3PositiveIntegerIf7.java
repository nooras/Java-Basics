package Set1;

import java.util.Scanner;

public class ProductOf3PositiveIntegerIf7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int total = 0;
		if(num1 != 7 && num2 != 7 && num3 != 7) {
			total = num1 * num2 * num3;
		}else if (num1 == 7){
			total = num2 * num3;
		}else if (num2 == 7){
			total = num3;
		}else if (num3 == 7){
			total = -1;
		}
		System.out.println(total);
	}
}

/*
Output:
1
5
3
15
--------
3
7
8
8
--------
7
2
9
18
--------
2
6
7
-1

*/ 
