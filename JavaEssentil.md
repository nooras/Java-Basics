

## What is an enterprise application?

- User Interface
- Service
- Validator
- Data Access Object 
- Model

1. Client tier 
- Provide an interface between the end user and the application
- Acts as an interface to the end-user. Clients can be a web browser or standalone applications which is present in Computer, Mobile etc.

2. Presentation tier
- Handle user request and also display infromation to the user
- This tier links the business logic of the application and the end user. It also takes care of displaying dynamic content to the end-user and accepting various inputs from the user.

Main class-Testet

3. Business tier
- handle business rules of the applicatiom
- This is the most vital part of the application. This tier represents the complete business logic and requirements of the application. All the main functionalities, like data validations and data manipulations lie in this tier of the application.

Service
validator

4. Persistence tier
- act as an interface between the business tier and the database.
- This acts as a go-between for the business tier and the database. It gets the requirements from the business tier, and based on it accesses data from the database.

Data object

## Project flow

For depicting this distinction, we have four different groups,

- User Interface – This is the group that belongs to the Presentation Tier. This group contains the userinterface package with a class called Tester. It takes care of processing the inputs from the user and relaying them to the concerned functionalities. For now, we are using a normal Java class. But in future we will use an HTML file to do so.
- Service – This is the group that belongs to the Business Tier. This group contains the service package with many Service interfaces and classes. It takes care of authenticating the user inputs, as well as performing all the business logics needed for the application.
- Validator – This along with the Service group belongs to the Business Tier. This group contains the validator package with different Validator classes. This class receives user input to be validated for proper format and data.
Data Access Object(DAO) – This is the group that belongs to the Persistence Tier. This group contains the dao package with many DAO interfaces and classes. It helps the application in interacting with the Database. In this course, we will be mocking the database. In the future courses, we will use the actual database.
- Model – This group contains classes which are used to transfer data from one class to the other.

#### Steps

The different steps taking place in the image shown are,

1. User inputs the data. This data is sent to the Tester class (or the Presentation Tier).
2. The Tester class converts the raw data to a proper Model class object (Objects used to transfer data from one class to another) and send the object to the Service Class (Business Tier).
3. The Service class sends the object to the Validator class to get the inputs validated. If the inputs are in valid format, the Validator returns a successful response, else a failure response.
4. The Service class performs any business operation to be performed on the data before sending it to the DAO class (Persistence Tier).
5. The Persistence Tier interacts with the database and returns the response of the database.
6. Based on the responses from the Validator and the DAO classes, the Service class formulates  either a successful output or a failure output and return the same to the Tester class.
7. The Tester class then displays this output to the User.

## Java Arcitecture

A Java program requires a Java development kit (JDK) for library support and development tools.          

Java compiler (javac.exe): A Java compiler is a program that converts source files into the respective byte code. The byte code is platform-independent. 

Java launcher (java.exe): Java launcher launches the Java application.

Java standard packages and runtime libraries contain the necessary code for executing Java applications.

Note: Previously, JDK came with a separate implementation for JRE (Java Runtime Environment). Now, starting from Java 11, Adopt OpenJDK does not come with separate JRE implementation; JDK will include JRE implementation. We will be using Adopt OpenJDK in this course.

Source code: Program written in Java language

Byte code: A .class file is generated after the Java code is compiled

ClassLoader: Loads all the class files needed for execution

Byte code verifier: Checks code for fragments for  illegal code

Interpreter: Converts byte code instruction to machine code

Compiler: Compiles reusable byte code instructions to machine code

Runtime: The overall execution of the program is assisted by Runtime.

Note: Graal is a new JIT compiler written entirely in Java. Graal is a high-performance JIT compiler. Graal is independent of HotSpot VM and produces faster native code, which is used to get optimized performance.

Java is platform independent
jvm dependet=nt

oops - encapsulation, data hiding
robust - memory management and mishandles runtime errors
secure
multithreading
architectural neutral and portable

## Class

A class is a design or blueprint that describes the characteristics and behaviors of a real-time entity. In other words, the class is a user-defined data type in Java.

It starts with the keyword "class" followed by a name.

It specifies attributes (characteristics) and methods (behaviors).

Attributes are the elements (instance variables) which hold the values of a particular entity that define its characteristics.

Methods are the sets of instructions that define the behaviors of the entity.

## Method

A method is a set of statements which depicts the behavior of a class. We have already encountered the main method. 

To execute any program, the compiler always needs an initial/entry point to start from. In case of Java programs, that initial/entry point is marked by the main()method present in the program. Without this method, the JVM cannot start executing the program. The syntax can be given as:
```
public static void main(String[] args){
    //statements
}
```
public: This specifies the level of access of the method within and outside the program. And to make main() method visible to JVM, the level of access must be set to "public". If the same is anything except public (private, protected or default) the JVM will be unable to see the initial/entry point of the program. And hence the program will not run.

static: Generally, a Java program is in the form of a class. And whenever we create classes in Java, we need to create instances/objects to access the class methods and attributes. The same applies to main() method also. But by declaring a class method as "static", we can call tha method without creating instances of the class. Hence we declare the main() method as static.

void: In Java, every method is expected to return a value of any type (integer, double, string etc.). And to make a method not return any value, it must be declared "void". Since the main() method is not expected to return any value, it must be declared as void. 

main(): As discussed above, a Java program is basically a class. And the main() method is the default method of this class. This method marks the initial/entry point of the Java program.

String args[]: Now a program in general may take inputs from the users. In Java, they are usually in the form of multiple strings as "command line arguments" grouped as an array of string. This string array is taken as the argument in the main() method. 

## Objects

 A Java class, is a blueprint so how do we use it? It can be done by providing some values to the attributes of the class. This is called the instantiation of a class and the entity we get after instantiation is called the object. 

An object is an instance of a class.

It allows us to use the attributes and behaviors specified in the class.

A class can have any number of objects.

An object holds data related to one instance of a class.

In Java, an object is created by using the new keyword.

### Note :

- During object creation, the instance variables are automatically assigned default values (for example: 0 for integer, 0.0 for double, null for String etc.) based on their respective datatypes.

- Local variables declared inside methods have to be initialized with relevant values before they can be used.

## Constructor

A constructor is a method which has the same name as the class. It is a special method as it does not return any value, and is used for creating objects and initializing their values.

Syntax:
```
<<classname>>(){  }
```
For Example:
```
//Constructor
Customer(){ }
//Constructor above is called while creating objects as shown below,
Customer custObj = new Customer();
```
Here, Customer() indicates constructor invocation during object creation

### Types of constructors:

1. Non-parameterised/Default constructor

A constructor which doesn't take any parameter

If the programmer doesn't provide any constructor, a non-parameterized/default constructor will be provided by the compiler.           

2. Parameterised Constructor

A constructor which accepts parameters (arguments)
```
//Parameterised constructor
Customer(int customerId) {
    System.out.println(customerId);
}
```
//Constructor above is called while creating objects as shown below,
```
Customer custObj = new Customer(1001);
```
Note: If the programmer provides a parameterized constructor then the default constructor is not provided by the compiler.

Next, let us learn about the 'this' keyword.

## this keyword

Now let us consider a situation where a method has an argument or a local variable which has its name similar to an instance variable. Who gets the higher preference, the local variable/argument or the instance variable?

Surprisingly, the local variable gets the higher preference than the instance variable inside the method. And this is known as shadowing of a field. So, how do we use both the instance variable and the local variable/argument together?

How do we call any constructors or methods of a class, from a method of the class?
```
class Customer{
	   String customerName;
	   public Customer(String customerName) {
		   customerName = customerName;
	   }
	   public void display () {
	     System.out.println("Customer Name : "+customerName); // Output :- Customer Name : null
	   }
}
public class Tester {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Jack");
		customer1.display();
	}
}
```
Here, the variable 'customerName' used in the constructor is local to that constructor. The instance variable (customerName) name will remain null.
To assign the value passed into the constructor to the instance variable 'customerName' and to call the display() method, this keyword can be used as shown below:
```
class Customer{
	   String customerName;
	   public Customer(String customerName) {
		   this.customerName = customerName;
	   }
	   public void display () {
	     System.out.println("Customer Name : "+customerName); // Output :- Customer Name : Jack
	   }
}
```
As we have learnt to invoke attributes using this, can we invoke methods using this? Let us see how to do that next.

- this keyword is also used to invoke the constructor or any method of the current object.

## Features of java


# jshell

Command line interface
REPL
Read- Evaluate - Print - Loop

> jshell
> System.out.println("Hello World")
> 

## Working of jshell

1. Parsed
2. Wrapped
3. COmpiled and Executed
4. Result

> /list
> /exit

## Type infernce mechanism

Keyword, Data Types
1. var

## package

## Acsess modeifier
private  - accessible only in class
protected - within same package and class
default - same package and subclass
public - acess anywhere

# REGULAR EXPRESSION

- A Regular Expression or Regex is a special sequence of characters that help in matching or finding other strings or set of strings, using a specialized syntax. Regex are used in searching, editing and manipulating the text. 

- The Regex API (java.util.regex) provides the necessary classes and interfaces for working with regular expressions. String class uses this API to support regex in its following methods: matches(), split(), replaceFirst(), and replaceAll(). Let us concentrate on the methods matches() and split() for now.

## matches() :
This method takes a regex as an argument and matches a given string with the specified regex pattern. This method returns a Boolean value for the comparison done. Return True if matched else return false

```
//Creating a Pattern through Regular Expression 
String regex = "Hello";
//String to be compared with RegEx 
String input = "Hello";
	
//Pattern Matching done using matches() method
System.out.println(input.matches(regex));
//Pattern Matching done using Pattern.matches() method
System.out.println(Pattern.matches(regex, input));
/**
 *  Output: true, true
 */

```

It is interesting to note that, input.matches(regex) yields the same result as Pattern.matches(regex, input).(Note: Pattern is one of the classes provided by the Regex API)

## split(): 
This method splits a given string into an array of string on the basis of regular expression mentioned in the argument of the method.

```
//Sample String
String chainedString = "Lets-break-this-chain-and-be-free-!";
//Creating Regex for splitting the String
String regex = "-";
//Splitting the String using split() method
//split()divides the String and stores them in a Array of String
String[] freeString = chainedString.split(regex);
/**
 *  freeString = ("Lets", "break", "this", "chain", "and", "be", "free", "!")
 */

```

## Date
LocalDate currentDate = LocalDate.now()

Localdate lastDate = currentDate.plustDays(3)
currentDate.getDayOfWeek()

LocalDate d1 = LocalDate.of(2008,2,4)

LocalDate d2 = LocalDate.of(2008,Month.MARCH,4)

LocalDate.now().isAfter(2021,08,2)

DateTimeFormatter df = DateTimeFormatter.OfPatter("dd/MM/yy");

DateTimeFormatter df = DateTimeFormatter.OfPatter("dd/MM/yy hh:mm:ss a"); //a am pm 12 hour format

DateTimeFormatter df = DateTimeFormatter.OfPatter("eeee dd/MM/yy hh:mm:ss a"); //eeee - friday/monday/etc

DateTimeFormatter df = DateTimeFormatter.OfPatter("eee dd/MM/yy hh:mm:ss a"); //eee - start 3 letter

SOP(df)

SOP(df.format(dateObj))

## Interface

on java 8 onward method can be default and sattic

if in 2 interface have same method is defalu then it shoule be overriden

## Function Interface

only 1 abstract method multple implemented menthod

## Exception vs error

Exception

can be handled
checked or unchecked
compile or runtime
appplication

error

cannot be handled
unchecked
runtime
environment

### Checked and unchecked

#### Checked

compile time
method
handled
genuine problems

### Unchecked

runtime
compile time ignored
logic error

