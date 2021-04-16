package Day3;


//interface Demo{
//	void printDemo();
//}
//public class Tester{
//	public static void main(String[] args) {
//    Demo demo = new Demo() {    //Line 1 
//	   public void printDemo() {
//		   System.out.println("In tester class");
//	    }
//    };
//   demo.printDemo(); //Line 2
//}
//}

//interface Demo { 
//    void demoOne();
//    void demoTwo();
//}

abstract class Child{
    public void demoOne(){
        System.out.println("demoOne executed");
    }
    public void demoTwo() {};
}

class SubChild extends Child {
    public void demoTwo(){
        System.out.println("demoTwo executed");
    } 
}
public class Tester{
    public static void main(String args[]) {
        Child child=new SubChild();
        child.demoTwo();
}
 
}

