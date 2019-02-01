/*Sample Input 0
2
hereiamstackerrank
hhaacckkekraraannk
hackerworld
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
Sample Output 0
YES
NO*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank_in_a_String {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'h' || s.charAt(i) == 'a' || s.charAt(i) == 'c' || s.charAt(i) == 'k'
                    || s.charAt(i) == 'e' || s.charAt(i) == 'r' || s.charAt(i) == 'n') {
                newString += s.charAt(i);
            }
        }
        String anotherString = "";
        String hackerrank = "hackerrank";
        int j = 0;
        for (int i = 0; i < hackerrank.length(); i++) {
            for (; j < newString.length();) {
                if (hackerrank.charAt(i) == newString.charAt(j)) {
                    anotherString += newString.charAt(j);
                    j = j + 1;
                    break;
                }
                j = j + 1;
            }

        }
        if (anotherString.equals(hackerrank)) {
            return "YES";
        }
        return "NO";
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
