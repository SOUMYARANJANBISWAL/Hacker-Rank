import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Sample Input
saveChangesInTheEditor
Sample Output
5
Explanation
String  contains five words:
save
Changes
In
The
Editor
Thus, we print 5 on a new line.*/
public class CamelCase {
    static int camelcase(String s) {
    	int result=0;
    	char[] ch=s.toCharArray();
    	for(int i=0;i<ch.length;i++) {
    		if(Character.isUpperCase(ch[i])) {
    			result++;
    		}
    	}
    	return result+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Enter word: ");
        String s = scanner.next();

        int result = camelcase(s);
        System.out.println(result);


        scanner.close();
    }
}
