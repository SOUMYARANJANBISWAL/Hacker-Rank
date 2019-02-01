/*2
1 2 3
1 3 2
Sample Output 0
Cat B
Mouse C*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Cats_and_Mouse {
    static String catAndMouse(int x, int y, int z) {
    	String result=null;
    	int catA=Math.abs(z-x);
    	int catB=Math.abs(z-y);
    	if(catA>catB) {
    		result="Cat B";
    	}else if(catA<catB) {
    		result="Cat A";
    	}else {
    		result="Mouse C";
    	}
    	return result;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
    		System.out.println("Enter catA");
            int x = scanner.nextInt();
            System.out.println("Enter catB");
            int y = scanner.nextInt();
            System.out.println("Enter MouseC");
            int z = scanner.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
    }
