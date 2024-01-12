package Practice;

import java.util.Scanner;
public class AngryProfessor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		int[]  arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Class(k,arr));
		
	}
	
	
	static String Class (int k ,int[] arr){
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <= 0) {
				count++;
			}
		}
		
		if(count >= k) {
			return "Class will not Cancelled";
		}
		else {
			return "Class will Cancelled";
		}
	}

}
