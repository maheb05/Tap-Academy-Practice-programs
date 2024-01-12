package Aarays;

import java.util.Scanner;
public class NamesofStudents {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter "+i+" Student Name :");
			a[i] = s.nextLine();
		}
		
		System.out.println("Names of the Students :");
		
		for(int i=1;i<5;i++) {
			System.out.println(a[i]);
		}
	}

}
