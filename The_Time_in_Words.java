/*Sample Input 0
5
47
Sample Output 0
thirteen minutes to six
Sample Input 1
3
00
Sample Output 1
three o' clock
Sample Input 2
7
15
Sample Output 2
quarter past seven*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class The_Time_in_Words {
    static String timeInWords(int h, int m) {
    	String[] min= {"zero minute", "one minutes","twominutes","three minutes","four minutes","five minutes","six minutes","seven minutes","eight minutes","nine minutes","ten minutes","eleven minutes",
    	"twelve minutes","thirteen minutes","fourteen minutes","quarter","sixteen minutes","seventeen minutes","eighteen minutes","nineteen minutes","twenty minutes","twenty one minutes",
    	"twenty two minutes","twenty three minutes","twenty four minutes","twenty five minutes","twenty six minutes","twenty seven minutes","twenty eight minutes","twenty nine minutes"};
    	String[] hour= {"zero", "one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
    	String str=null;
    	if(m==00) {
    		str=hour[h]+" o' clock";
    	}else if(m>=1 && m<30) {
    		str= min[m]+" past "+hour[h];
    	}else if(m==30) {
    		str="half past "+hour[h];
    	}else if(m>30) {
    		str=min[60-m]+" to "+hour[h+1];
    	}
    	return str;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Enter hour: ");
        int h = scanner.nextInt();
        System.out.println("Enter min: ");
        int m = scanner.nextInt();
        String result = timeInWords(h, m);
        System.out.println(result);

        scanner.close();
    }
}

