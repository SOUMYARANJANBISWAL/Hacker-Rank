import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/*
Sample Input
6
1 2 3 4 10 11
Sample Output
31
Explanation
We print the sum of the array's elements: 1+2+3+4+10+11=31
*/
public class Simple_Array_Sum {
	    static int simpleArraySum() {
	    	int[] ar= {1, 2, 3, 4, 10, 11};
	        int sum=0;
	         for(int i=0;i<ar.length;i++){
	             sum=sum+ar[i];
	         }
	    return sum;
	    }

	   // private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
	        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        int arCount = Integer.parseInt(scanner.nextLine().trim());
	        int[] ar = new int[arCount];
	        String[] arItems = scanner.nextLine().split(" ");
	        for (int arItr = 0; arItr < arCount; arItr++) {
	            int arItem = Integer.parseInt(arItems[arItr].trim());
	            ar[arItr] = arItem;
	        }
	        int result = simpleArraySum(ar);
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        bufferedWriter.close();*/
	    	System.out.println("Result: "+simpleArraySum());
	    }
}

