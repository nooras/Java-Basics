import java.lang.*;
public class Program1Factorial {
	public static void main(String[] args) {
		int first = 1;
		do {
			if(first == 3) {
				first += 1;
				continue;
			}
			System.out.println(first);
			first += 1;
		}while(first != 5);
	}
}
