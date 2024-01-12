import java.util.Scanner;

public class HeugtOfStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 6;
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = width(arr,k);
		System.out.println("the width of the wall is :"+res);
	}
	
	static int width(int[] arr,int k) {
		
		int widthIs = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <=k) {
				widthIs = widthIs + 1;
			}
			else {
				widthIs = widthIs + 2;
			}
		}
		return widthIs;
	}
}
