package DayTwoExercise;

import java.util.Scanner;

public class GeometricSequenceN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  total;
		for(int i=0; i<n; i++) {
			total = 2;
			total = (int) Math.pow(total, i);
			if(i == n-1) {
				System.out.print(total);
			}else {
				System.out.print(total + ", ");
			}
		}
		sc.close();
	}
}

/*
5
1, 2, 4, 8, 16
--------------
8
1, 2, 4, 8, 16, 32, 64, 128
*/
