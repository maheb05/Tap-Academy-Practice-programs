package Practice;

public class PatOne {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			int count = i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				//System.out.print(count--+" ");OR
				System.out.print(count-j+1+" ");
			}
			System.out.println();
		}
	}

}
