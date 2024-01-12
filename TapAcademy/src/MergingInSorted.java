import java.util.Scanner;

public class MergingInSorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] a1 = new int[m];
		for(int i=0;i<a1.length;i++) {
			a1[i] = sc.nextInt();
		}
		int result[] = array(a,a1);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	static int[] array(int[] a,int[] a1) {
		int k=0;int j=0;int i=0;
		int[] res = new int[a.length+a1.length];
		while(i<a.length && j<a1.length) {
			
			if(a[i] < a1[j]) {
				res[k] = a[i];
				k++;
				i++;
			}
			else {
				res[k] = a1[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			res[k++] = a[i];
			i++;
		}
		while(j<a1.length) {
			res[k++] = a1[j];
			j++;
		}
		return res;
	}

}
