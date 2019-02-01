import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*Sample Input
6
-4 3 -9 0 4 1         
Sample Output
0.500000  0.333333  0.166667
Explanation
There are  3 positive numbers, 2 negative numbers, and 1 zero in the array. 
The proportions of occurrence are positive:3/6=0.500000 , 
negative:2/6=0.333333  and 
zeros:1/6=0.166667*/
public class Plus_Minus {
	    // Complete the plusMinus function below.
	    static void plusMinus(int[] arr) {
	    	double plus=0;
			double minus=0;
			double zero=0;
	    	for(int i=0;i<arr.length;i++) {
	    		if(arr[i]>0) {
	    			plus++;
	    		}
	    		if(arr[i]<0) {
	    			minus++;
	    		}
	    		if(arr[i]==0) {
	    			zero++;
	    		}
	    	}
	    	System.out.println(plus/(arr.length));
	    	System.out.println(minus/(arr.length));
	    	System.out.println(zero/(arr.length));

	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter Range");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter Value: ");
	        for (int i = 0; i < n; i++) {
	            int arrItem = scanner.nextInt();
	            arr[i] = arrItem;
	        }
	        plusMinus(arr);
	        scanner.close();
	    }
}

