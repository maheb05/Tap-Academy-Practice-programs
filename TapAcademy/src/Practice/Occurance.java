package Practice;
import java.util.Scanner;
public class Occurance {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of the Array ");
		int n = s.nextInt();
		int[] a = new int[n];
		
		System.out.println("Elements of the Array ");
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("Highest Occured integer is ");
		oCC(a);
	}
	
	
	
	static void oCC(int[] a) {
		int count = 0;
		int max = 0;
		int ele = 0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i] == a[i+1]) {
				count++;
			}
			else {
				if(count > max) {
					max = count;
					ele = a[i];
				}
				count = 1;
			}
		}
		if(count > max) {
			max = count;
			ele = a[a.length-1];
		}
		System.out.println(ele);
	}

}
