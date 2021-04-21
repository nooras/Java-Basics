package Day1;

abstract class t1{
	t1(){
		System.out.println("hiiii");
	}
}

public class Test1 extends t1 {
	public int display() {
		try {
			System.out.println("try");
			return 1;
		}catch(Exception E) {
			System.out.println("catch");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(t.display());
	}
}
