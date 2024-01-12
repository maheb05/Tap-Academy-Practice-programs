package Parrernsofyt;

public class Patterns {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int  m=5;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 ||  i==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		int a=5;
		int count=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int b=5;
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print((i+j)-1+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int c=5;
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int d=5;
		for(int i=1;i<=d;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		int e=5;
		for(int i=1;i<=e;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int f=5;
		for(int i=1;i<=f;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int  g=5;
		for(int i=1;i<=g;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		int h=5;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==n || j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int l=5;
		for(int i=1;i<=l;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1 || i==l || j==1 || j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int o=5;
		for(int i=1;i<=o;i++) {
			for(int k=1;k<=o-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1 ||  i==o || j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int p=5;
		for(int i=p;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int q=5;
		int  num=1;
		for(int i=1;i<=q;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		
		int r=5;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
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
	
