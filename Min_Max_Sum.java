import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Sample Input
1 2 3 4 5
Sample Output
10 14
Explanation
Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:
If we sum everything 1 except , our sum is .2+3+4+5=14
If we sum everything 2 except , our sum is .1+3+4+5=13
If we sum everything 3 except , our sum is .1+2+4+5=12
If we sum everything 4 except , our sum is .1+2+3+5=11
If we sum everything 5 except , our sum is .1+2+3+4=10
*/
public class Min_Max_Sum {
	    static void miniMaxSum(int[] arr) {

	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        int[] arr = new int[5];
	        String[] arrItems = scanner.nextLine().split(" ");
	        for (int i = 0; i < 5; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	        miniMaxSum(arr);
	        scanner.close();
	    }
}
