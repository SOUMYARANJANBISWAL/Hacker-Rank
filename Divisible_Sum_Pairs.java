/*
Sample Input
6 3
1 3 2 6 1 2
Explain: 6 is length of array and have to find pair divisible by 3
(1,2),(1,2),(3,6),(2,1),(1,2) these all 5 pair 
Sample Output
5
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Divisible_Sum_Pairs {
	    static int divisibleSumPairs(int n, int k, int[] ar) {
	    	int result=0;
	    	for(int i=0;i<ar.length;i++) {
	    		for(int j=i+1;j<ar.length;j++) {
	    			if(((ar[i]+ar[j])%k)==0) {
	    				result++;
	    				}
	    		}
	    	}
	    	
	    	return result;
	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
	        System.out.println("Enter length of array: ");
	    	int n = scanner.nextInt();
	    	System.out.println("Enter the value: ");
	        int k = scanner.nextInt();
	        System.out.println("Enter the all value of Array");
	        int[] ar = new int[n];
	        for (int i = 0; i < n; i++) {
	            int arItem = scanner.nextInt();
	            ar[i] = arItem;
	        }
	        int result = divisibleSumPairs(n, k, ar);
	        scanner.close();
	        System.out.println(result);
	    }
	}


