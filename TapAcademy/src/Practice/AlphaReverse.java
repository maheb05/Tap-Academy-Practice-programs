package Practice;

public class AlphaReverse {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		
		for(int i=1;i<=n;i++) {
				if(i%2==0) {
					char rev = (char)(ch+i-1);
					for(int j=1;j<=i;j++) {
						System.out.print(rev-- +" ");
						ch++;
					}
				}
				else {
					for(int j=1;j<=i;j++) {
						System.out.print(ch++ +" ");
					}
				}
				System.out.println();
		}
	}

}
