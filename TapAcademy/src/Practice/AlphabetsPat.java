package Practice;

public class AlphabetsPat {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
		System.out.println();
//		
//		int m = 5;
//		char chh = 'A';
//		
//		for(int i=1;i<=m;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(chh+++" ");
//			}
//			System.out.println();
//		}
//		
	}

}
