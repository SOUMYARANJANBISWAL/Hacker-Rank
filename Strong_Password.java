/*numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Sample Input 0
3
Ab1
Sample Output 0
3
Explanation 0*/
import java.io.*;
import java.util.*;

public class Strong_Password {
    static int minimumNumber(int n, String password) {
    	int count=0;
    	String lowercase = ".*[a-z]+.*";
        String uppercase = ".*[A-Z]+.*";
        String num = ".*[0-9]+.*";
        String specialchar = ".*[-!@#$%^&*()+]+.*"; 
        if(!(password.matches(lowercase))) {
        	count++;
        }
        if(!(password.matches(num))) {
        	count++;
        }
        if(!(password.matches(uppercase))) {
        	count++;
        }
        if(!(password.matches(specialchar))) {
        	count++;
        }
        return (count>(6-n))?count:(6-n);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    	System.out.println("Enter Char");
        int n = scanner.nextInt();
        System.out.println("Enter string");
        String password = scanner.nextLine();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        scanner.close();
    }
}
