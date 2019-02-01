/*
11
1 2 3 4 5 4 3 2 1 3 4
Sample Output 1
3
Explanation 1
The different types of birds occur in the following frequencies:
Type 1:2 
Type 2:2 
Type 3:3 
Type 4:3 
Type 5:1 
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Migratory_Birds {
	    static int migratoryBirds(List<Integer> arr) {


	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
	        int result = migratoryBirds(arr);
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
