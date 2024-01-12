package Practice;

public class IintoJPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n;j++) {
				
				if(i*j<10) {
					System.out.print("0");
				}
				System.out.print(i*j+" ");
				
			}
			
			System.out.println();
		}

	}

}
