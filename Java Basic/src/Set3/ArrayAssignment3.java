package Set3;

public class ArrayAssignment3 {
	public static int[] findLeapYears(int year){
	       //Implement your code here and change the return value accordingly
	        int count = 0;
		    int[] arr = new int[15];
		    while(true) {
		    	if(year%4 == 0) {
		    		if(year%100 !=0 || year%400 ==0) {
		    			arr[count] = year;
		    			count +=1;
		    		}
		    	}
		    	year += 1;
		    	if(count == 15)
		    		break;
		    }
			return arr;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
}

/*
 2000
2004
2008
2012
2016
2020
2024
2028
2032
2036
2040
2044
2048
2052
2056

 */
