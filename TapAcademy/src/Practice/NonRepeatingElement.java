package Practice;
import java.util.Scanner;
public class NonRepeatingElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		non(a);
	}
	
	
	static void non(int[] a){
        for(int i=0;i<a.length;i++){
            int x = a[i];
            int count = 0;
            
            for(int j=0;j<a.length;j++){
                if(a[j]==x){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a[i]+" ");
            }
        }

}
}
