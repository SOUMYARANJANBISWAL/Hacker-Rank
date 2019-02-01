/*Sample Output Input
6
1 4 3 5 6 2
Sample Output
1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 */
import java.util.*;

public class Insertion_Sort_Part2 {
    static void insertionSort2(int n, int[] arr) {
        for(int i=1;i<n;i++){
        	for(int j=0;j<i;j++) {
        		if(arr[j]>arr[i]) {
        			int min=arr[i];
        			arr[i]=arr[j];
        			arr[j]=min;
        		}
        	}
        	 for(int k=0;k<n;k++) {
         		System.out.print(arr[k]+" ");
         	}
         	System.out.println();
        }
       
    }

    @SuppressWarnings("unused")
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       /* int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }
        insertionSort2(n, arr);
        scanner.close();*/
    	int[] arr= {1,4,3,5,6,2};
    	insertionSort2(6,arr);
    }
}

