import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*Sample Input
3
11   2    4
4    5    6
10   8   -12
Sample Output
15
Explanation
The primary diagonal is:
11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:
     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
*/
public class Diagonal_Difference {
	    static int diagonalDifference(int[][] arr) {
	    	int dig1=0;
	    	int dig2=0;
	    	int row=arr.length;
	    	int col=arr[0].length;
	    	for(int i = 0, j =0; i< row && j < col; i++, j++) {
	    		dig1=dig1+arr[i][j];
	    	}
	    	for(int i = 0, j =col-1; i< row && j <col; i++, j--) {
	    		dig2=dig2+arr[i][j];
	    	}
	    	int value=dig1-dig2;
	    	return value;
	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
	      /*  int n = scanner.nextInt();
	        int[][] arr = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            for (int j = 0; j < n; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }*/
	    	int[][] arr = new int[][] {
	            new int[] { 11,   2 ,   4},
	            new int[] { 4 ,   5 ,   6},
	            new int[] { 10 ,  8 ,  -12},
	        };
	        int result = diagonalDifference(arr);
	        scanner.close();
	        System.out.println("Result"+result);
	    }
}

