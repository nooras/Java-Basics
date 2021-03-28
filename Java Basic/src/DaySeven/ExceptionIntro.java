/*
WHen you dont want to handle exception in method add throws keyword InvalidProductException
*/
package DaySeven;

public class ExceptionIntro {
	public static void main(String[] args) {
		try {
			System.out.print("hoo");
		}
		catch(ArithmeticException e) {
			System.out.print("Divided by 0 exxception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range");
		}catch(Exception e)  //parent of all exception
		{
			System.out.print("Some error");
		}catch(Throwable e) //parent of Exception
		{
			System.out.print("Some error(throwable)");
		}
	}
}
