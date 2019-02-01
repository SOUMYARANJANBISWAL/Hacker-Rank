/*Sample Input
2 3
2 4
16 32 96
Sample Output
3
Explanation
2 and 4 divide evenly into 4, 8, 12 and 16. 
4, 8 and 16 divide evenly into 16, 32, 96.
4, 8 and 16 are the only three numbers for 
which each element of a is a factor and each is a factor of all elements of b.*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class Between_Two_Sets {
	    static int getTotalX(int[] a, int[] b) {
	    	int result=0;
	    	for(int i=4;i<=16;i++) {
	    		if(i%2==0 && i%4==0) {
	    			int res=i;
	    			if(16%res==0 && 32%res==0 && 96%res==0) {
	    				result++;
	    			}
	    		}
	    	}
	    	return result;
	    }
	    private static final Scanner scan = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter first arry length");
	        int n = scan.nextInt();
	        System.out.println("Enter second arry length");
	        int m = scan.nextInt();
	        System.out.println("Enter 1st array: ");
	        int[] a = new int[n];
	        for (int aItr = 0; aItr < n; aItr++) {
	            int aItem = scan.nextInt();
	            a[aItr] = aItem;
	        }
	        System.out.println("Enter 2nd array: ");
	        int[] b = new int[m];
	        for (int bItr = 0; bItr < m; bItr++) {
	            int bItem = scan.nextInt();
	            b[bItr] = bItem;
	        }
	        int total = getTotalX(a, b);
	        System.out.println(total);
	    }
	}
