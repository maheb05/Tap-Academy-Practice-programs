package Practice;
import java.util.Scanner;
public class DEmo {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        // implement your logic here

	        int[] a = new int[N];
	        int count = 0;

	        for(int i=0;i<a.length;i++){
	            a[i] = s.nextInt();
	        }
	        
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[i]+" ");
	        }
	        System.out.println();
	        int max = a[0];
	        int max2 = a[0];

	        for(int i=1;i<a.length;i++ ){
	            if(a[i]<max){
	            	max2 = max;
	                max = a[i];
	            }
	            else if(a[i]< max2 && a[i] != max) {
	            	max2 = a[i];
	            }
	        }
	         System.out.println(max);
	         System.out.println(max2);
	         
	         int sum = max * max2;
	         System.out.println(sum);
//	        for(int i=0;i<a.length;i++){
//	            if(a[i]==max){
//	                count++;
//	            }
//	        }
//	        System.out.println(count);
	    }
	}