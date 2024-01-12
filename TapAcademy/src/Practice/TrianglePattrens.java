package Practice;

import java.util.Scanner;
public class TrianglePattrens {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter N value to print the Stars");
        int n=s.nextInt();
        
        for(int i=1;i<=n-1;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2!=0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

}