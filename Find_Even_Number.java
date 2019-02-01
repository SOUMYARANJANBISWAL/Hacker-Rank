import java.util.*;
public class Find_Even_Number {

	static Scanner scanner=null;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int no1=scanner.nextInt();
		System.out.print("Enter 2nd Number: ");
		int no2=scanner.nextInt();
		result(no1,no2);
	}
	public static void result(int no1,int no2) {
		int temp=0;
		if(no1>no2) {
			temp=no1;
			no1=no2;
			no2=temp;
		}
		System.out.println("Even Number Between "+no1+" "+no2+" is:- ");
		System.out.print("[ ");
		for(int i=no1+1;i<no2;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("]");
	}

}
