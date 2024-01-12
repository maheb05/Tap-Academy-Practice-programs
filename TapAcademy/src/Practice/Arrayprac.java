package Practice;

import java.util.*;
public class Arrayprac {
	private static final char A = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter how many Students marks have to Store ");
//		int n =s.nextInt();
//		
//		int[] a = new int[n];
//		for(int i=0;i<=a.length-1;i++) {
//			System.out.println("Enter Studnet "+i+" marks ");
//			a[i] = s.nextInt();
//		}
//		System.out.println("The Marks of the Students are :");
//		
//		for(int i=0;i<=a.length-1;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		//System.out.println("Enter Array size ");
		//int n = s.nextInt();
		
//		int[] a = {10,20,30,40,50};
//		int i,j;
//		for(i=0,j=a.length-1;i<=a.length-1 && j>=0;i++,j--) {
//			System.out.println(a[j]+" ");

//		}
		
//		int n[] = {20,30,60,50,40,100,134,123};
//		int max = n[0];
//		
//		for(int i=1;i<n.length;i++) {
//			if(n[i]>max) {
//				max = n[i];
//			}
//		}
//		System.out.println(max);
	/*	char s2 ;
		
		char[] s1 = {'w','o','w'};
		for(int i=s1.length-1;i>=0;i--) {
			s2 = s1.length;
		}
		if(s2==s1) {
			
		}*/
//		
//		String str = "Hello World!";
//		System.out.println(str.toLowerCase());
//		for (int i = str.length() - 1; i >= 0; i--) {
//		    System.out.print(str.charAt(i));
//		}
//		System.out.println(str.toLowerCase());
		
//		int a = 10;
//		int b = 20;
//		int c = s.nextInt();
//		
//		switch(c) {
//		case 1 : System.out.println((a+b));
//		break;
//		
//		case 2 : System.out.println((a-b));
//		break;
//		
//		case 3 : System.out.println((a*b));
//		break;
//		
//		case 4 : System.out.println((a/b));
//		break;
//		
//		case 5 : System.out.println((a%b));
//		break;
//		}
		
//		int n = s.nextInt();
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(count<10) {
//					System.out.print("0");
//					if(i==10) {
//						break;
//					}
//				}
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}
		
		//String s1 = "JAva";
//		String s2 = "JAvac";
//		
//		int res = s1.compareTo(s2);
//		
//		if(res == 0) {
//		 	System.out.println("Strings are Equal ");
//		}
//		else if(res>0) {
//			System.out.println("S1 > s2");;
//		}
//		else {
//			System.out.println("S2 > S1");
		//}
//		
//		String s1 = "Tap";
//		System.out.println(s1);
//		String s2 = s1.concat("Academy");
//		System.out.println(s2);
		System.out.println("Enter String ");
		String S = s.nextLine(); 
		
		StringTokenizer st= new StringTokenizer(S);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}


