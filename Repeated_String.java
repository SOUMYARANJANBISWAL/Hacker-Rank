/*Sample Input 0
aba
10
Sample Output 0
7
Explanation 0 
The first 10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we print 7 on a new line.
Input (stdin)Download
aab
882787
Expected OutputDownload
588525
*/
import java.io.*;
import java.util.*;
public class Repeated_String {
    static long repeatedString(String s, long n) {
    	/*long count=0;
    	if(s.length()==1) {
    		if(s.indexOf('a')==0) {
    			return n;
    		}
    	}else {
    		String concatString="";
    		long div=(n/s.length())+1;
    		System.out.println(div);
    		for(int i=0;i<=div;i++) {
    			concatString=s+concatString;
    		}
    		System.out.println(concatString);
    		char[] ch=concatString.toCharArray();
    		for(int j=0;j<=n;j++) {
    			if(ch[j]=='a') {
    				count++;
    			}
    		}
    	}
    	return count;*/
    	long count=0;
    	if(s.length()==1) {
    		if(s.indexOf('a')==0) {
    			return n;
    		}
    	}else {
    	for(char c : s.toCharArray())
            if(c == 'a')
            count++;
    	long div=n/s.length();
    	long rem=n%s.length();
    	count=count*div;
    	for(int i=0;i<rem;i++) {
            if(s.charAt(i)=='a')
                    count++;
            }
    	}
    	return count;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Enter String: ");
    	String s = scanner.nextLine();
    	System.out.println("Enter Number: ");
        long n = scanner.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
