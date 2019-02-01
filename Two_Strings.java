/*Sample Input
2
hello
world
hi
world
Sample Output
YES if common substring
NO if no common substring*/

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Two_Strings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	String result="NO";
    	char[]ch1= s1.toCharArray();
    	char[] ch2=s2.toCharArray();
    	for(int i=0;i<ch1.length;i++) {
    		for(int j=0;j<ch2.length;j++) {
    			if(ch1[i]==ch2[j]) {
    				result="YES";
    			}
        	}
    	}
    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter1st: ");
    	String s1=scanner.next();
    	System.out.println("Enter 2nd:");
        String s2= scanner.next();
    	String result=twoStrings(s1, s2);
    	System.out.println(result);
    }
}

