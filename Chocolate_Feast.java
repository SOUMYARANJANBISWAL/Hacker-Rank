/*3
10 2 5
12 4 4
6 2 2
Sample Output
6
3
5
case:1
 10 dlr and 2rs per chocolate 5 wrapper then you can get 1 chocolate
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Chocolate_Feast {
    static int chocolateFeast(int n, int c, int m) {
    	int chocolate=0;
    	chocolate=n/c;
    	int count=chocolate;
    	if(m>count) {
    		count=chocolate;
    	}else {
    		while(m<=count) {
    			count=count-m;
    			chocolate++;
    			count++;
    		}
    	}

    	return chocolate;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    	System.out.println("Dlr: ");
            int n = scanner.nextInt();
            System.out.println("rs per piece: ");
            int c = scanner.nextInt();
            System.out.println("Wrapper: ");
            int m = scanner.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
    }


