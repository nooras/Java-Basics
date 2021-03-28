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

for override method -> 

private methods cannot be ovrride
static method cannot be override

Dynamic binding:
parent ref holding parent class object
child ref holding child class obj
parent ref can hold child class object

parent ref can hold child class object -> dynamic binding

It can access only the overiden method of child class only
methods of parent class are accessibe

Override (child) method + all method of parent = Parent can access
All child method + all method of parent = child can access

Access modifier of overriding method cannot be more restrictive
Order of restriction in decreasing way: private, default, proteccted, public

parent => protected
child => public

void method() -- > parent class
void method() -- ovverride child class

void method(int a ) -- > parent class
void method() -- different child class method - not override

void method(int a ) -- > parent class
@Override
void method()  -> child class -> error saying that it is not a a overrideen method


*/


package DayFive;

public class PolymorphosmIntro {

}
