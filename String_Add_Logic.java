/*
Print: 3
No: 123
Ltr:ABC
O/P: BDF
*/
import java.util.Scanner;
public class String_Add_Logic {
	static Scanner scanner=null;
	static int range=0;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		//Enter Range
		System.out.print("Enter How Range: ");
		range=scanner.nextInt();
		//Enter Number
		int int_Array[] = new int[range];
		System.out.print("Enter Number: ");
		for(int i=0;i<range;i++) {
			int_Array[i]=scanner.nextInt();
		}
		//Enter Character
		System.out.print("Enter String: ");
		String string=scanner.next();
		char char_st[]=string.toCharArray();
		if(string.length()==range && int_Array.length==range) {
			for(int j=0;j<range;j++) {
				char result=(char)(char_st[j]+int_Array[j]);
				System.out.print(result);
			}
		}else
			System.out.println("You entered Wrong input");
			
	}

}
