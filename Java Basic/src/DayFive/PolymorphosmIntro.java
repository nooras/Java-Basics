/*
Polymorphism :
1. Static - complie time - method overloading
2. Dynamic - runtime - method overriding

method overloading:
allow us to create methods iwth same name inside same class but diffrent in their signature

3 ways:
1. number of parameters
	void display(int a)
	void display(int a, int b)

2. data type of parameters
	void display(int a, int b)
	void display(float a, float b)
	
3. Order of parameters
	void display(string a, float b, string c)
	void display(string a, string b, float c)
	
only if return type is differ then not consdidered overloaded method
	void display(int a)
	int display(int a)
	
try to invoke that display method --> which method to invoke??
the binding is done during the compile time


type promotion:
promoted the lower range type to a higher range only 
*/


package DayFive;

public class PolymorphosmIntro {

}
