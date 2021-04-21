package Day1;

public class ArrayTryout1 {
public static void main(String a[]){
        
        //After implementing, copy the below code in JShell to execute
        int scores[]={281, 344, 265, 272, 236, 324, 287};
        double sum=0,avg=0;
        
        for(int index=0;index<scores.length;index++){
            sum=sum+scores[index];
        }
       
        avg=sum/scores.length;
        
        System.out.println("The average score of te team is "+avg);
        //Complete the code as desired output shown in problem statement
        int eq = 0;
        int above = 0;
        for(int index=0;index<scores.length;index++){
        	if(scores[index] == avg) {
        		eq += 1;
        	}else if(scores[index] > avg) {
        		above += 1;
        	}
        }
        System.out.println("No. of matches having score above average is " + above);
        System.out.println("No. of matches having score equal to average is " + eq);
        System.out.println("No. of matches having score below average is "+ (scores.length - above - eq));
        
    }
}
