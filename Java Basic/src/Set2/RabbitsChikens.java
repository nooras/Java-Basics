package Set2;

import java.util.Scanner;

/*
 X - Rabbits
 Y - Chikens
 H - Heads
 L - Legs
 
 X + Y = H -> * 2 => 2X + 2Y = 2H
 4X + 2Y = L
 
 	4X + 2Y = L
 	2X + 2Y = 2H
  -
  ----------------
    2X - 0 = L - 2H
    2X = L - 2H    ---> Final equation
 
*/

public class RabbitsChikens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, L, X;
		H = sc.nextInt();
		L = sc.nextInt();
		X = (L - 2*H)/2;
		if( 4*X + 2*(H-X) == L ) {
			System.out.println("Chickens=" + (H - X));
			System.out.println("Rabbits=" + X);
		}else {
			System.out.println("The numbers of chickens and rabbits cannot be found");
		}
		
	}

}

/*
150
500
Chickens=50
Rabbits=100
-----------
3
11
The numbers of chickens and rabbits cannot be found


*/
