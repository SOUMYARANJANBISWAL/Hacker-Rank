import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*Sample Input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Sample Output
YES
NO
Explanation
For the first test case, . The professor wants at least 3 students in attendance,
but only 2 have arrived on time ( -1and-3 ) so the class is cancelled.
For the second test case, . The professor wants at least 2 students in attendance,
and there are  who have arrived on time ( 0and-1 ) so the class is not cancelled.*/
public class Angry_Professor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
    	String result="YES";
    	int len=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]<=0) {
    			len++;
    		}
    	}
    	if(len>=k) {
    		result="NO";
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    	System.out.println("Enter case");
        int t = scanner.nextInt();
        System.out.println("How many");
            int n = scanner.nextInt();
            System.out.println("How many you want");
            int k = scanner.nextInt();
            int[] a = new int[n];
            System.out.println("Enter student");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
    }

