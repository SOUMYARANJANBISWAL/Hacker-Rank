import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Compare Score Between two people
public class Score_Check {
	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    	List<Integer> score = new ArrayList<Integer>();
	    	score.add(0);
	    	score.add(0);
	        for(int i=0;i<a.size();i++){
	            if (a.get(i) >  b.get(i)){
	                score.set(0, score.get(0)+1);
	            }else if(a.get(i) <  b.get(i)){
	            	score.set(1, score.get(1)+1);
	            }
	        }
			return score;

	    }

	    public static void main(String[] args) {
	    	 Scanner scanner=new Scanner(System.in);
	    	 List<Integer> a=new ArrayList<Integer>();
	    	 System.out.println("Enter Soumya Score: ");
	         for(int i=0;i<3;i++)
	         {  
	        	 int m=scanner.nextInt();
	             a.add(m);
	         }
	         
	         List<Integer> b=new ArrayList<Integer>();
	         System.out.println("Enter Ranjan Score: ");
	         for(int i=0;i<3;i++)
	         {  
	        	 int n=scanner.nextInt();
	             b.add(n);
	         }

	        List<Integer> result = compareTriplets(a, b);
	        System.out.println("Compare Score Soumya and Ranjan:"+result);
	        
	    }
	}

