import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005
Output
5000000015
*/
public class Very_Big_Sum {
	    static long aVeryBigSum(long[] ar) {
	        long sum=0;
	        for(int i=0;i<ar.length;i++){
	        	sum=sum+ar[i];
	        }
	        return sum;
	    }

	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args){
	    	System.out.println("Enter Range: ");
	        int arCount = scanner.nextInt();
	        long[] ar = new long[arCount];
	        System.out.println("Enter Value: ");
	        for (int i = 0; i < arCount; i++) {
	            ar[i] = scanner.nextLong();
	        }
	        long result = aVeryBigSum(ar);
	        System.out.println("Result= "+result);
	        scanner.close();
	    }
}
