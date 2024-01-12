import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int res=remove(arr,k);
		System.out.println(res);
	}
	static int remove(int[] arr,int k) {
		int a2 = arr.length-1;
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<=k;j++) {
				
				a2 = arr[0];
			}
		}
		return a2;
	}

}
