import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Sample Input 0
4
3 2 1 3
Sample Output 0
2
Explanation 0
We have one candle of height 1, one candle of height 2, and two candles of height 3.
Your niece only blows out the tallest candles, meaning the candles where height 3.
Because there are 2 such candles, we print 2 on a new line.
*/
public class Birthday_Cake_Candles {
    static int birthdayCakeCandles(int[] ar) {
    	int max=ar[0];
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            
        }
        for(int i=0;i<ar.length;i++){
                if(ar[i]==max){
                    count++;
                }
            }
        return count;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
    	System.out.println("Enter range: ");
        int arCount = scanner.nextInt();
        System.out.println("Enter range: ");
        int[] ar = new int[arCount];
        for (int i = 0; i < arCount; i++) {
            int arItem = scanner.nextInt();
            ar[i] = arItem;
        }
        int result = birthdayCakeCandles(ar);
        System.out.println("result"+result);
        scanner.close();
    }
}