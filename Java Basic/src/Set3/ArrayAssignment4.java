package Set3;

public class ArrayAssignment4 {
//	public static int count(int num) {
//		int sum = 0, val=num;
//		
//		while(val != 0) {
//			sum += val%10;
//			val = val/10;
//		}
//		
////		String x = String.valueOf(num), temp;
////		for(int i=0; i<x.length();i++) {
////			temp = String.valueOf(x.charAt(i)); 	
////			val = Integer.parseInt(temp);
////			total += val;
////		}
//		
//		return sum;
//	}
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int s,k=0;
		int temp;
		if(num1<num2)
		{
			if(num1<9)
			{
				num1 = 9;
			}
			for(int i=num1;i<=num2;i++)
			{
				if(i>100)
					break;
				s=0;
				if(i%5==0)
				{
					temp=i;
					while(temp!=0)
					{
						s=s+temp%10;
						temp=temp/10;
					}
					if(s%3==0)
					{
						numbers[k++]=i;
					}
				}
			}
		}
		return numbers;
//		int[] numbers = new int[6];
//		int j = 0, val, sum;
//
//		// Implement your code here
//		if(num1>=num2 || num1>=100 || num2<0 || num2>=100)
//			   return numbers;
//		
//		if(num1 < num2) {
//		    if(num1<9)
//		      num1=9;
//			for(int i = num1; i<= num2; i++) {
//			    sum=0;
//				if(i%5==0) {
//				    val = i;
//				    while(val != 0) {
//			         sum += val%10;
//			         val = val/10;
//		            }
//					if(sum%3==0) {
//						numbers[j++] = i;
//					}
//				}
//			}
//		}
//
//		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 200;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}


//class Tester {
//	
//	public static int[] findNumbers(int num1, int num2) {
//		int[] numbers = new int[6];
//		int j = 0, val, sum;
//
//		// Implement your code here
//		if(num1>=num2 || num1>=100 || num2<0 || num2>=100)
//		   return numbers;
//		
//		if(num1 < num2) {
//		    if(num1<9)
//		      num1=9;
//			for(int i = num1; i<= num2; i++) {
//			    sum=0;
//				if(i%5==0) {
//				    val = i;
//				    while(val != 0) {
//			         sum += val%10;
//			         val = val/10;
//		            }
//					if(sum%3==0) {
//						numbers[j++] = i;
//					}
//				}
//			}
//		}
//
//		return numbers;
//	}
//
//	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 30;
//
//		int[] numbers = findNumbers(num1, num2);
//		if (numbers[0] == 0) {
//			System.out.println("There is no such number!");
//		} else {
//			for (int index = 0; index <= numbers.length - 1; index++) {
//				if (numbers[index] == 0) {
//					break;
//				}
//				System.out.println(numbers[index]);
//			}
//		}
//
//	}
//}
