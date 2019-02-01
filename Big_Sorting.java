/*Sample Input 0
6
31415926535897932384626433832795
1
3
10
3
5
Sample Output 0
1
3
3
5
10
31415926535897932384626433832795*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Big_Sorting {
    static String[] bigSorting(String[] unsorted) {


    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        String[] unsorted = new String[n];
        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
               k bufferedWriter.write("\n");
            }
        }

        scanner.close();
    }
}
