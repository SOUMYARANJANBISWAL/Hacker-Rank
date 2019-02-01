/*
Sample Input 0
4
73
67
38
33
Sample Output 0
75
67
40
33
Student 1 received a 73, and the next 5multiple of from 73 is 75. Since 75-73<3, the student's grade is rounded to 75 .
Student 2 received a 67, and the next 5multiple of  from 67 is 70 . Since 70-67=3, the grade will not be modified and the student's final grade is 67.
Student 3 received a 38, and the next 5multiple of  from  38 is 40. Since 40-38<3, the student's grade will be rounded to 40.
Student 4 received a 33 grade below 38, so the grade will not be modified and the student's final grade is 33 .
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class Grading_Students {
	    static int[] gradingStudents(int[] grades) {

	    	for(int x=0;x<grades.length;x++) {
	    		int value=grades[x]+(5-(grades[x]%5));
	    		if(value-grades[x]==3 || grades[x]<38) {
	    			grades[x]=grades[x];
	    		}else if(value-grades[x]<3) {
	    			grades[x]=value;
	    		}
	    	}
	    	return grades;
	    }

	    private static final Scanner scan = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter How many people: ");
	        int n = scan.nextInt();
	        int[] grades = new int[n];
	        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
	            int gradesItem = scan.nextInt();
	            grades[gradesItr] = gradesItem;
	        }
	        int[] result = gradingStudents(grades);
	        for(int i=0;i<result.length;i++) {
	        	System.out.print(result[i]+" ");
	        }
	    }
	}

