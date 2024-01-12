package Practice;

import java.util.Scanner;
public class CountPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i,j,n=5,count=1;
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n;j++) {
				
				if(count < 10) {
					System.out.print("0");
				}
				
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}
	}

}
