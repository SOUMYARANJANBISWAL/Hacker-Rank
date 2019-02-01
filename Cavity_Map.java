/*Sample Input
4
1112
1912
1892
1234
Sample Output
1112
1X12
18X2
1234
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cavity_Map {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	for(int i=0;i<grid.length;i++) {
    		char ch[]=grid[i].toCharArray();
    		for(int j=0;j<ch.length;j++) {
    			if(ch[j]==9) {
    				ch[j].
    			}
    		}
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

