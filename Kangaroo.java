/*Sample Input 1
0 2 5 3
Sample Output 1
NO*/
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;
public class Kangaroo {
	    static String kangaroo(int x1, int v1, int x2, int v2) {
	    	String str=null;
	    	while(x1<=100) {
	    		x1=x1+v1;
	    		x2=x2+v2;
	    		System.out.println(x1+" "+x2);
	    		if(x1==x2) {
	    			str="YES";
	    			break;
	    			
	    			}else
	    				str="NO";
	    	}
	    	return str;
	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter x1");
	        int x1 = scanner.nextInt();
	        System.out.println("Enter v1");
	        int v1 = scanner.nextInt();
	        System.out.println("Enter x2");
	        int x2 = scanner.nextInt();
	        System.out.println("Enter v2");
	        int v2 = scanner.nextInt();
	        String result = kangaroo(x1, v1, x2, v2);
	        System.out.println(result);
	        scanner.close();
	    }
}
