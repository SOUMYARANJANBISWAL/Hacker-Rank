/*1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
A-Z all letter hight
abc
Sample Output 0
Highest hight*Number of char
9
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Designer_PDF_Viewer {
    static int designerPdfViewer(int[] h, String word) {
    	int result=0;
    	int max=0;
    	char[] ch=word.toCharArray();
    	int[] value=new int[ch.length];
    	int[] array=new int[ch.length];
    	for(int j=0;j<ch.length;j++) {
    		int lower_case=96;
    		array[j]=ch[j]-lower_case;
    	}
    	for(int i=0;i<array.length;i++) {
    		int res=array[i];
    		value[i]=h[res];
    		System.out.println(value[i]);
    	}
    	for(int k=0;k<value.length;k++) {
    		if(max<value[k]) {
    			max=value[k];
    		}
    	}
    	result=max*word.length();
    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        int[] h = new int[26];
        System.out.println("enter");
        for (int i = 0; i < 26; i++) {
            h[i] = scanner.nextInt();
        }
        System.out.println("Enter word");
        String word = scanner.nextLine();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        scanner.close();
    }
}
