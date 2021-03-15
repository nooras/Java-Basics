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