package Set3;

public class ArrayAssignment2 {
//	public static double[] findDetails(double[] salary) {
//        //Implement your code here and change the return value accordingly
//		double temp = 0;
//		for(int i =0; i<salary.length;i++) {
//			temp += salary[i];
//		}
//		temp = temp/salary.length;
//		double count = 0;
//		double count2 = 0;
//		for(int i =0; i<salary.length;i++) {
//			if (temp < salary[i])
//				count += 1;
//			if (temp > salary[i])
//				count2 += 1;
//		}
//		
//		double[] details = {temp, count, count2};
//        return details;   
//
//    }
//       
//    public static void main(String[] args) {
//        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
//        double[] details = findDetails(salary);
//              
//        System.out.println("Average salary: "+ details[0]);
//        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
//        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
//    }
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
Average salary: 23914.0
Number of salaries greater than the average salary: 2.0
Number of salaries lesser than the average salary: 3.0
*/
