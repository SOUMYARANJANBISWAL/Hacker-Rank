/*Sample Input
5
2 4 6 8 3
Sample Output
2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8*/ 
import java.util.*;
public class Insertion_Sort_Part1 {
    static void insertionSort1(int n, int[] arr) {
    	int last = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > last) {
                arr[i + 1] = arr[i];
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            } else if (arr[i] < last) {
                arr[i + 1] = last;
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j]+" ");
                }
                break; 
            }
        }
        if (arr[0] > last) {
            arr[0] = last;
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k]+" ");
            }
        }

    }     

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Array size: ");
        int n = scanner.nextInt();
        System.out.println("Enter array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort1(n, arr);
    }
}

