/*Sample Input
1 2 3 4 5
Sample Output
10 14
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mini_Max_Sum {
    static void miniMaxSum(int[] arr) {
    	int len=arr.length;
        int greater=0;
    int sum=0;
    for(int i=0;i<len;i++) {
          for(int j=0;j<len;j++){
              if(arr[i]<arr[j]){
                  greater=arr[i];
                  arr[i]=arr[j];
                  arr[j]=greater;
              }
          }
       }
	   for(int i=0;i<len;i++) {
		   sum=sum+arr[i];
	   }
	   int min=sum-arr[len-1];
	   int max=sum-arr[0];
   
	   System.out.println(min+" "+max);

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter aarray: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("dfdfdf");
        miniMaxSum(arr);
        scanner.close();
    }
}
