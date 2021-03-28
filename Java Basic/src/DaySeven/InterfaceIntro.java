/*
Interface:

1. Blueprint of class
2. Interface sepicify wahat a class must do. It is a blueprint of the class
3. Variables -> public, sattic, final
4. Method -> public, abstract
5. 
class A extends class B{
}
Interface A{
	public abstract void display();
}

this class must implement display methods
class B implements A{
}

class C implemnts A -- display method

6. Class can axtends only one class but we can implemennt multiple interfaces
7. All the method of interface must be implenet in class
8. class can extend class + implemensts interface
9. No insatnce varible should be present in interface
10. Cannot have implemented method
11. interface extends/implemenst class --> not possible
12. One interface can extends another interface.

example :
interface a - method1 & 2

abstract b implemenst a
method1 - unimplemneted method

class implements interface
interface extends interface1, interface2
class extends class

Dynamic binding can also be approach

*/

package DaySeven;

public class InterfaceIntro {
	public static void main(String[] args) {
		System.out.print("hoo");
	}
}

interface abc{
	int x = 10;
	void draw();
}

class bcd implements abc{
	public void draw() {
		int x = 10;
	}
}
