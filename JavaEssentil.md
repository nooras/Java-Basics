

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

## Arrays

Arrays is an inbuilt Java class belonging to java.util package. It has many static methods for quick comparing, searching, sorting of arrays and other utility methods. Many of these methods help us to do away with loops required for manipulating and accessing arrays.

Arrays is an inbuilt class and should not be confused with an array which is collection of homogeneous elements.

Methods of the class can be called using below syntax –
```
Arrays.<<method name>>
```
Example
```
int[] numArr = {6,8,9,10,40,66};
int resultIndex = Arrays.binarySearch(numArr, 40);
```
Here index of the search element will be returned. A negative index is returned if element is not found.

Another useful method is equals() -
```
int[] numArr1 = {6,8,9,10,40,66};
int[] numArr2 = {6,8,9,10,40,66};
boolean resultCompare = Arrays.equals(numArr1, numArr2);
System.out.println(resultCompare); //prints true or false
```
To sort an array we just need to do the following-
```
int[] numArr = {6,8,9,10,40,66};
Arrays.sort(numArr);
```
sort() method does not return any value and changes the content of original array.

Arrays class provides its own version of toString() method which can be used to quickly print elements of an array.
```
int[] numArr = {6,8,9,10,40,66};
System.out.println(Arrays.toString(numArr));
```
You can explore more about Arrays here.

You will also see a tryout on Arrays later.

## Enumeration

Enumerations are group of named constants. All enums implicitly extend the java.lang.Enum class. The enum fields are implicitly static and final, and hence are constant during compile time. But they are instances of their enum type, constructed when the enum type is referenced for the first time.

Why do we need these grouped constants?

Let us assume that a developer is creating online Pizza ordering application. He wants to allow the customers to choose the size of the pizza. The sizes allowed are small, medium and large only.
He realizes that having the type of the size variable as String has a chance of some developer entering any arbitrary size. And this could cause invalid processing. How can we stop the Pizza size to be initialized anything other than these three values.

Using enums allows us to limit the selection within a set of values.

An enum is a datatype which contains a fixed set of constant values. For example,

directions (NORTH, EAST, WEST, SOUTH)
pizzaSize (SMALL, MEDIUM, LARGE)
 

Syntax:        
```
public enum enum_name { constant1, constant2, ..., constant n }
```
Example:      
```
public enum PizzaSize { SMALL, MEDIUM, LARGE }
```
This type can be declared  to limit the usage to the above 3 values.
```
private PizzaSize size;
```

Let us look at some features about enums:

Enums are considered as reference-types like classes and interfaces in Java, and hence, a programmer can define constructors, methods and variables, inside them.
A static method called values() is automatically generated by the Java compiler for each enum. The values() method returns an array of all the constant values defined inside the enum.
Enum variables can be used in an if statement or switch statement.
if statement-
```
if(this.size.equals(PizzaSize.MEDIUM)){
	System.out.println("Size is Medium");
}
```
switch statement- 
```
PizzaSize currentSize = PizzaSize.MEDIUM;
		double discount = 0;
		// using enum in switch case
		switch (currentSize) {
		case SMALL:
			discount = 10;
			break;
		case MEDIUM:
			discount = 20.5;
			break;
		case LARGE:
			discount = 30.2;
			break;
		}
```		
We can loop through the enum and print constant values.

for loop-
```
		//values() method returns an array of all values inside enum
		//ordinal() method can be used to display values assigned to enum constants
		for (PizzaSize psize : PizzaSize.values()) {
			System.out.println(psize+" "+psize.ordinal());
		}
```

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

Some Examples:
1. 
```
//Regular Expression for Name Validation:
String nameRegex = "([A-Za-z ]+)";        
//Regular Expression for Email Id Validation:
String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
```
2. Format of Courier Consignment Tracking Number:
<<2_Uppercase_Characters>>-<<9_digits>>:<<2_Uppercase_Characters>>
Example: "EK-860619645:IN"
```
String firstSubRegex = "[A-Z]{2}[-]"; 


//First Alternative:
String secondSubRegex = "[0-9]{9}[:]";
//Another Alternative:
String secondSubRegex = "[\\d]{9}[:]";

String thirdSubRegex = "[A-Z]{9}"

/Concatenation of all three Sub-Regex:
String finalRegexPatternConcat = firstSubRegex + secondSubRegex + thirdSubRegex;
//Alternatively the single Regex:
String finalRegexPatternComplete = "([A-Z]{2}[-])([\\d]{9}[:])([A-Z]{2})";
```

3. Requirement: To search the pattern "App" in the given string "Application".
```
String searchStr = "Application";
String regexStr = "App.*";
System.out.println(searchStr.matches(regexStr));                                //Output: true
```
4. Requirement: To search the pattern having two characters in between A and l in the given string "A%(lication".
```
String searchStr = "A%(lication";
String regexStr = "A..lication";
System.out.println(searchStr.matches(regexStr));                                //Output: true
```
5. Requirement: To search for a digit between M and t in the given string "M4thematics".
```
String searchStr = "M4thematics";
String regexStr = "M\\dt.*";
System.out.println(searchStr.matches(regexStr));                                //Output: true
```
6. Requirement: To search for a number between 4 and 8 in between X and Y in the given string.
```
String searchStr = "X9Y";
String regexStr = "X[4-8]Y";
System.out.println(searchStr.matches(regexStr));                                //Output: false
```
7. Requirement: To search for the pattern "Hell" or "Fell" in the given string "Fellow".
```
String searchStr = "Fellow";
String regexStr = "(Hell|Fell).*";
System.out.println(searchStr.matches(regexStr));                                //Output: true
 ```

8. Requirement: To check for the space after "Air" in the given string "Air line".
```
String searchStr = "Air line";
String regexStr = "Air\\s.*";
System.out.println(searchStr.matches(regexStr));                                //Output: true
 ```

9. Requirement: To check if a number is found 0 or n times after X in the given string.
```
String searchStr = "X4756Y";
String regexStr = "X\\d*Y";
System.out.println(searchStr.matches(regexStr));                                //Output: true
 ```

10. Requirement: To check if a number is found 1 or n times after M in the given string.
```
String searchStr = "M4N";
String regexStr = "M\\d+N";
System.out.println(searchStr.matches(regexStr));                                //Output: true
 ```

11. Requirement: To check if a number is found 0 or 1 times after A in the given string.
```
String searchStr = "M2N";
String regexStr = "M\\d?N";
System.out.println(searchStr.matches(regexStr));                                //Output: true
 ```

12. Requirement: To check if 3 digits are present after A in the given string.
```
String searchStr = "M42N";
String regexStr = "M\\d{3}N";
System.out.println(searchStr.matches(regexStr));                                //Output: false
 ```
```
```
```
```


## Date

LocalDate
LocalDate is an immutable class (present in java.time package) that represents a date with default format "yyyy-MM-dd" (year-month-day). We can access other date fields, such as day-of-year, day-of-week and week-of-year from this class . For example, the value "4th Jan 2007" can be stored in a LocalDate in the default format (2007-01-04).

This class does not store or represent a time or time-zone.

LocalDate Methods

This class consists of default methods such as minusDays, minusMonths, minusYears, now, plusDays etc which help us in various scenarios where date is concerned.

Now, we will see the implementation of some most used methods of LocalDate Class.
```
LocalDate today = LocalDate.now(); // now() returns the current date from system clock
System.out.println(today); // output will be today's date
		
LocalDate dateObj = LocalDate.of(1997, 8, 29); // of() returns the instance of LocalDate 
                                               //with specified arguements
System.out.println(dateObj); // output : 1997-08-29
```
Consider a scenario where we want to display the date (given above) i.e. 1997-08-29 in format of dd/MM/yy (i.e. 29/08/97). In that case what can we do ?

To solve this problem Java provides us with a different class which is used for parsing dates in different formats. This class is called  as DateTimeFormatter (present in java.time package). Implementation of the same is given below.
```
LocalDate dateObj = LocalDate.of(1997, 8, 29);
				
DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); //ofPattern() creates a formatter using the specified pattern.
		
System.out.println(df.format(dateObj)); //output 29/08/97
```
To explore more about DateTimeFormatter class click here.

LocalDate provides methods with which we can manipulate the date, for example plusYears() - which returns a copy of LocalDate with the specified number of years added, similarly minusDays(), minusWeeks(), etc.
```
LocalDate newDate = LocalDate.now();
newDate = newDate.plusDays(34); 
System.out.println(newDate);   // 2020-04-09
		
newDate = newDate.plusYears(45); // 2065-04-09
		
newDate = newDate.minusWeeks(87); // 2063-08-09
```
Now we will see some of the methods which will allow us to get the difference between two dates.
```
LocalDate today = LocalDate.now();
LocalDate newDateObj = today.minusWeeks(39);
System.out.println(ChronoUnit.DAYS.between(newDateObj,today));  //273
//between() calculates the amount of time between specified date objects
System.out.println(ChronoUnit.MONTHS.between(newDateObj,today)); //8
//compareTo() compares this date with specified date
System.out.println(newDateObj.compareTo(today)); //-1 
```
Java8 provides us ChronoUnit which is an enum, it is standard set of date periods units. This set of units provide unit-based access to manipulate a date, time or date-time. In example given above we are calculating difference between two date objects in Days and Months.

Method description of some methods is given below:
```
Method										Description
LocalDate now()								The current system clock date is returned.
LocalDate plusDays(long daysToAdd)			A LocalDate with the number of days added as specified is returned.
LocalDate plusMonths(long monthsToAdd)		A LocalDate with the number of months added as specified is returned.
LocalDate minusMonths(long monthsToSubtract)	A LocalDate with the number of months subtracted as specified is returned.
LocalDate minusDays(long daysToSubtract)	A LocalDate with the number of days subtracted as specified is returned.
boolean equals(Object obj)					Checks equality of two dates.
int compareTo(ChronoLocalDate other)		Compares the given date to another date.
											Returns 0, 1, -1 based on the equality of the specified dates.
int get(TemporalField field)				Fetches the value of the specified field from the given date as an integer.
String format(DateTimeFormatter formatter)	Formats the given date according to the given formatter.
```

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

## time

LocalTime
LocalTime is a class that represents time with a default format of "hour-minute-second" (hh-mm-ss.zzz). It is immutable by nature. Time is represented to the precision of nanosecond. For example, the value "09:11:44.140" can be stored in a LocalTime in the default format.

LocalDate Class is present in java.time package.

LocalTime Methods

This class consists of default methods such as minusHours, minusMinutes, of, now, plusHours etc which help us in various scenarios where time is concerned. 

Now we will see the implementation of some most used methods.
```
LocalTime currentTime = LocalTime.now(); 
System.out.println(currentTime);  // will display current time eg. 15:44:44.932359900
		
LocalTime newTimeObj = LocalTime.of(9, 45, 59); 
System.out.println(newTimeObj); //09:45:59
		
DateTimeFormatter df = DateTimeFormatter.ofPattern("h:mm:ss");
System.out.println(df.format(currentTime)); //will give output in specified format eg.3:44:44
```
As we have seen ChronoUnit and DateTimeFormatter in LocalDate, we will try methods related to those classes in tryout. 

To access the fields (hour, minute, etc.) we use get method. Implementation of the same is given below.
```
LocalTime newTimeObj = LocalTime.of(9, 45, 59);
		
int hour = newTimeObj.getHour();
int second = newTimeObj.getSecond();
int minute = newTimeObj.getMinute();
System.out.println(hour+":"+second+":"+minute); //9:45:59
```
Rest of the methods we will learn in tryout.

Description of some methods, of the LocalTime class, is given below.

Method	Description
LocalTime now()	The current system clock time is returned.
LocalTime of(int hour, int minute, int second)	According to the values of hours, minutes and seconds a LocalTime is returned.
LocalTime plusHours(long hoursToAdd)	A LocalTime with number of hours added as specified is returned.
LocalTime plusMinutes(long minutesToAdd)	A LocalTime with number of minutes added as specified is returned.
LocalTime minusHours(long hoursToSubtract)	A LocalTime with number of hours subtracted as specified is returned.
LocalTime minusMinutes(long minutesToSubtract)	A LocalTime with number of minutes subtracted as specified is returned.
int get(TemporalField field)	Fetches the value of the specified field from the given time as an integer.
String format(DateTimeFormatter formatter)

Formats the given time using the specified formatter.

## localdatetime

LocalDateTime
LocalDateTime is an immutable class that represents a date-time, with the default format as "yyyy-MM-dd-HH-mm-ss.zzz" year-month-day-hour-minute-second. Other date and time fields, such as day-of-year, day-of-week and week-of-year, can also be accessed.

Time is represented to nanosecond precision. For example, the value "2nd October 2007 at 13:45.30.123456789" can be stored in a LocalDateTime.

This class does not store or represent a date or time-zone. 

LocalDateTime Class is present in java.time package with the method declaration as shown below:

LocalDateTime Methods

This class consists of default methods such as minusDays, minusMonths, minusYears, now, plusDays etc which help us in various scenarios where date is concerned.

We will see the implementation of some methods.

LocalDateTime currentDate = LocalDateTime.now();
System.out.println(currentDate); // output in default format eg. 2020-03-06T16:25:10.257251100
		
System.out.println(currentDate.getDayOfWeek()); // will give today's day eg. FRIDAY


LocalDateTime currentDate = LocalDateTime.now();
System.out.println(currentDate);
		
DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy/ hh:mm:ss a");  // a is used to display 12 hr clock
System.out.println(df.format(currentDate)); //output in specified format eg. 06/03/2020/ 04:32:35 PM
If we want to display DateTime in specific format we use DateTimeFormatter and format method, as shown.
Now, consider a situation where it is required to display the day, can we do it using DateTimeFormatter class?

DateTimeFormatter df = DateTimeFormatter.ofPattern("eeee dd/MM/yyyy/ hh:mm:ss a");
System.out.println(df.format(currentDate)); 
//output :- Friday 06/03/2020/ 04:50:54 PM
		
DateTimeFormatter dfNew = DateTimeFormatter.ofPattern("eee dd/MM/yyyy/ hh:mm:ss a");
System.out.println(df.format(currentDate));
//output :- Fri 06/03/2020/ 04:50:54 PM
As we can see we used modified the pattern with eeee or eee which displays the day of the date. 

"eee” – Displays starting three letters of Day of the week such as “Mon”, “Tue”, etc.
“eeee” – Displays the full name of the Day of the week such as “Monday”, “Tuesday” etc.

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

