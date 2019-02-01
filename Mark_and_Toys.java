import java.io.*;
import java.util.*;

public class Mark_and_Toys {
    static int maximumToys(int[] prices, int k) {
        int count=0;
        int result=0;
        for(int j=0;j<prices.length;j++){
            for(int m=j+1;m<prices.length;m++){
                if(prices[j]>prices[m]){
                    int max=prices[j];
                    prices[j]=prices[m];
                    prices[m]=max;
                }
            }
        }
        for(int l=0;l<prices.length;l++) {
        	System.out.print(prices[l]+" ");
        }
        for(int i=0;i<prices.length;i++){
        	count=count+prices[i];
            if(count<=k){
                result++;
                System.out.println(" njnk"+result);
            }
        }
        return result;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    	int[] prices= {1,2,3,4};
    	int k=7;
        int result = maximumToys(prices, k);
        System.out.println(result);
        scanner.close();
    }
}
