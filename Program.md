# Set1
## Introduction to Java - Assignment 1
Problem :
Create a new Java project with "AddressDetails.java" file and implement a Java code to display your address. 

Sample Output:
Door No: D089
Street: St. Louis Street
City: Springfield
ZIP Code: 62729

```
package Set1;

public class Address {
	public static void main(String[] args) {
		System.out.println("Door No: 01");
		System.out.println("Street: Abc xyz");
		System.out.println("City: New york");
		System.out.println("Zip Code: 102452");
	}
}

/*
Output:
Door No: 01
Street: Abc xyz
City: New york
Zip Code: 102452

*/

```

## Data Types and Operators - Assignment 1

Implement a program to find the area of a circle by using the formula given below and display the calculated area. 
Area = pi * radius * radius 
The value of pi is 3.14.
 
```
package Set1;

public class AreaOfCircle {
	public static void main(String[] args) {
		int radius = 4;
		double pi = 3.14;
		double area = pi*radius*radius;
		System.out.println(area);
	}
}

/*
Output:
50.24

*/

```

## Data Types and Operators - Assignment 2

Problem Statement
Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula given below and display the converted value. 
C = ((F-32)/9)*5 where, C represents temperature in Celsius and F represents temperature in Fahrenheit.
 
```
package Set1;

//import java.lang.*;
import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Farenheit = sc.nextInt();
		int Celsius = ((Farenheit-32)/9)*5;
		System.out.println(Celsius);
	}
}

/*
Output:
32
0
-----
50
10

*/
	
```

## Selection Control Structure - Assignment 1

Problem Statement
Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.

```
//Sum of 2 numbers if number is same else display the double of sum
package Set1;

import java.util.Scanner;

public class SumOf2NumberDoubleofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total;
		if(num1 == num2) {
			total = num1 + num2;
		}else {
			total = (num1 + num2)*2;
		}
		System.out.println(total);
	}
}

/*
Output:
6
5
22
------
5
5
10
 */

```

## Selection Control Structure - Assignment 2

Problem Statement
Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.
Find the discriminant value using the formula given below.
discriminant = b2 - 4ac
If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
Use the formula given below to find the roots of a quadratic equation.
x = (-b ± discriminant)/2a


```
package Set1;

import java.util.*;

public class DiscriminantValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b ,c , discriminant;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		discriminant = b*b - 4*a*c;
		//Math.pow(a, b)
		
		/*
		 if discriminant is equal to 0 then root will same display the value of root
		 if discriminant > 0 display the unequl root
		 if discriminant < 0 no real roots
		 */
		if(discriminant == 0) {
			System.out.println("The root is " + (-b+discriminant)/(2*a));
		}else if (discriminant > 0) {
			System.out.println("The root1 is " + (-b+discriminant)/(2*a));
			System.out.println("The root2 is " + (-b-discriminant)/(2*a));
		}else {
			System.out.println("The euation has no real root");
		}
	}
}

/*
Output:
1
4
4
The root is -2
--------------
1
-5
2
The root1 is 11
The root2 is -6
--------------
1
4
6
The euation has no real root
*/

```

## Selection Control Structure - Assignment 3

Problem Statement
Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
Note: Only one of the three values can be 7.


```
package Set1;

import java.util.Scanner;

public class ProductOf3PositiveIntegerIf7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
 		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int total = 0;
		if(num1 != 7 && num2 != 7 && num3 != 7) {
			total = num1 * num2 * num3;
		}else if (num1 == 7){
			total = num2 * num3;
		}else if (num2 == 7){
			total = num3;
		}else if (num3 == 7){
			total = -1;
		}
		System.out.println(total);
	}
}

/*
Output:
1
5
3
15
--------
3
7
8
8
--------
7
2
9
18
--------
2
6
7
-1

*/ 

```

## Selection Control Structure - Assignment 4

Problem Statement
Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:

Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 
Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
Distance in kms must be greater than 0.
Quantity ordered should be minimum 1.
If any of the input is invalid, the bill amount should be displayed as -1.

```
package Set1;

import java.util.Scanner;

public class VegNonVegAmount {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int quantity,distance,bill=0,item=0;
		char ch = sc.next().charAt(0);
		quantity=sc.nextInt();
		distance=sc.nextInt();
		if(distance<0||quantity<1||(ch!='N'&&ch!='V'))
			System.out.println(-1);
		else
		{
			if(ch=='N')
				item=15;
			else if(ch=='V')
				item=12;
			bill=quantity*item;
			if(distance>3 && distance <7)
				bill+=distance-3;
			else if(distance>6)
				bill+=(distance-6)*2+3;
			System.out.println(bill);
		}
		sc.close();		
	}
}

```

## Selection Control Structure - Assignment 5

Problem Statement
The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.
Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and the loan type they expect to avail.
The values required for determining the eligible loan amount and the EMI are:
account number of the customer
account balance of the customer
salary of the customer
loan type 
expected loan amount
expected no. of EMIs
The following validations should be performed:
The account number should be of 4 digits and its first digit should be 1
The customer should have a minimum balance of $1000 in the account
Display appropriate error messages if the validations fail.
If the validations pass, determine whether the bank would provide the loan or not. 
The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. The bank decides the eligible loan amount and the number of EMIs based on the below table.

```
package Set1;

import java.util.Scanner;

public class BankLoan {
	public static void main(String[] args) {
		int accountNumber, salary, accountBalance, loanAmountExpected, emisExpected, eligibleLoanAmount, eligibleEmis;
		String loanType;
		Scanner sc = new Scanner(System.in);
		accountNumber = sc.nextInt();
		salary = sc.nextInt();
		accountBalance = sc.nextInt();
		loanType = sc.next();
		loanAmountExpected = sc.nextInt();
		emisExpected = sc.nextInt();
		if(accountNumber<999  || accountNumber>2000) {
			System.out.println("Invalid account Number");
		}else if(accountBalance<1000) {
			System.out.println("Insufficiant Balance");
		}
		else {
			if(salary>25000 && salary<50000) {
				eligibleLoanAmount = 500000;
				eligibleEmis = 36;
			}else if(salary>=50000 && salary<75000) {
				eligibleLoanAmount = 6000000;
				eligibleEmis = 60;
			}else if(salary>=75000) {
				eligibleLoanAmount = 7500000;
				eligibleEmis = 84;
			}else {
				eligibleLoanAmount = 0;
				eligibleEmis = 0;
				System.out.println("Not eligible");
			}
			System.out.println("EligibleLoanAmount = " + eligibleLoanAmount + " EligibleEmis = " + eligibleEmis);
		}
		
		sc.close();
	}
}


/*
Output:

1001
40000
250000
Car
300000
30
EligibleLoanAmount = 500000 EligibleEmis = 36
---------------------------------------------
1026
50000
300000
Car
400000
40
EligibleLoanAmount = 6000000 EligibleEmis = 60
----------------------------------------------
20065
5545
5655655
hhhv
6265
665
Invalid account Number
----------------------------------------------
1654
500
2655526
Car
655645
55645
Not eligible
EligibleLoanAmount = 0 EligibleEmis = 0


*/
```

