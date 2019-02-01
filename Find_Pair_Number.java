import java.util.*;
public class Find_Pair_Number {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int[] int_array= {12,0,10,7,8,53,22};
		for(int i=0;i<int_array.length;i++) {
			for(int j=i+1;j<int_array.length;j++) {
				if(int_array[i]+int_array[j]==n) {
					System.out.println(int_array[i]+" "+int_array[j]);
				}
			}
		}
	}

}
