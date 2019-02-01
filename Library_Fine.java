/*Sample Input
9 6 2015
6 6 2015
Sample Output
45
Explanation
If the book is returned on or before the expected return date, no fine will be charged 
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, 15*(d2-d1)
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the 150*(m2-m1)
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000
28 2 2015
15 4 2015
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Library_Fine {

	    // Complete the libraryFine function below.
	    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
	    	int result=0;
	    	if(y1<y2) {
	    		result=0;
	    	}else if(y1>y2) {
	    		result=10000;
	    	}else if(y1==y2) {
	    		if(m1>m2) {
	    			result=500*(m1-m2);
	    		}else if(m1==m2) {
	    			if(d1>d2) {
	    				result=15*(d1-d2);
	    			}
	    		}
	    	}
	    	
	    	return result;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter submit date: ");
	        int d1 = scanner.nextInt();
	        int m1 = scanner.nextInt();
	        int y1 = scanner.nextInt();
	       System.out.println("Enter actual issue date");
	        int d2 = scanner.nextInt();
	        int m2 = scanner.nextInt();
	        int y2 = scanner.nextInt();
	        int result = libraryFine(d1, m1, y1, d2, m2, y2);
	        System.out.println(result);
	        scanner.close();
	    }
	}

