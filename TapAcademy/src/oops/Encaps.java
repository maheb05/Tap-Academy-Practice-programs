package oops;

import java.util.Scanner;

public class Encaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer id :");
		int cID = sc.nextInt();
		System.out.println("Enter Customer FirstName :");
		String cName1st = sc.next();
		System.out.println("Enter Customer lastName :");
		String cNamelast = sc.next();
		String t = cName1st+cNamelast;
		System.out.println("Enter Customer Number :");
		long cNum = sc.nextLong();
		
		System.out.println();
		System.out.println("The Details Are :");
		System.out.println();
		
		Customer c = new Customer(cID,t,cNum);
		System.out.println("Customer id :"+c.getcID());
		System.out.println("Customer Name :"+c.getcName());
		System.out.println("Customer Number :"+c.getcNum());
		
	}

}





class Customer {
	
	private int cID;
	private String cName;
	private long cNum;
	
	public Customer(int cID,String cName,long cNum) {
		this.cID = cID;
		this.cName = cName;
		this.cNum = cNum;
	}
	
	public int getcID() {
		return cID;
	}
	
	public String getcName(){
		return cName;
	}
	
	public long getcNum() {
		return cNum;
	}
}
