package DaySix;

public class Try2 {
	public static void main(String args[]) {
		X ref1 = new X();
		Y ref2 = new Y();
		
		X ref3 = new X(); //invoke parent method and ovverride method in class
		System.out.println(ref3.x);
	}
}

class X{
	int x = 10;
}

class Y extends X{
	int x = 20;
}
