
/* 	 #
    ##
   ###
  ####
 #####
######
*/
import java.util.Scanner;
public class Staircase_Star {
	    static void staircase(int n) {
	    	for (int i=n;i>=1;i--) {
	    		for (int j=1;j<=n;j++) {
	    			if(j>=i) {
	    				System.out.print("*");
	    			}else {
	    				System.out.print(" ");
	    			}
	    		}
	    		System.out.println();
	    	}

	    }
	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter Range: ");
	        int n = scanner.nextInt();
	        staircase(n);
	        scanner.close();
	    }
}
