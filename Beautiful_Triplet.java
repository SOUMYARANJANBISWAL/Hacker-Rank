/*Sample Input
7 3
1 2 4 5 7 8 10
Sample Output
3*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Beautiful_Triplet {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
    	int count=0;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[j]-arr[i]==d) {
    				for(int k=j+1;k<arr.length;k++) {
    					if(arr[k]-arr[j]==d) {
    						count++;
    					}
    				}
    			}
    		}
    	}

    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Range: ");
        int n = scanner.nextInt();
        System.out.println("result: ");
        int d = scanner.nextInt();
        System.out.println("value: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        scanner.close();
    }
}
