/*Sample Input 0
SOSSPSSQSSOR
Sample Output 0
3
Explanation 0
a= SOSSPSSQSSOR, and signal length 12 . Sami sent 4 SOS messages (i.e.:12/3=4 ).
Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR
Difference:          X  X   X*/
import java.io.*;
import java.util.*;

public class Mars_Exploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)){
                count++;
            } 
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

