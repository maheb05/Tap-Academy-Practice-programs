package collectionoops;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Factory{
	private int number;
	private String name;
	private String location;
	private long revenue;
	private double tax;
	private float salary;
	public Factory(int number, String name, String location, long revenue, double tax, float salary) {
		super();
		this.number = number;
		this.name = name;
		this.location = location;
		this.revenue = revenue;
		this.tax = tax;
		this.salary = salary;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class Three {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many factories");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Factory Details");

		ArrayList<Factory> list = new ArrayList<Factory>();
		
		for(int i=0;i<n;i++) {
			String s = scan.nextLine();
			String[] ar = s.split(",");
			int num = 1+i;
			String name = ar[0];
			String location = ar[1];
			long revenue = Long.parseLong(ar[2]);
			double tax = Double.parseDouble( ar[3]);
			float salary =Float.parseFloat(ar[4]);
			
			Factory fac = new Factory(num,name,location,revenue,tax,salary);
			list.add(fac);
		}
		System.out.println("Here is your entered details ");
		System.out.println();
		ListIterator<Factory> li = list.listIterator();
		while(li.hasNext()) {
			Factory yes = li.next();
			System.out.println(yes.getNumber()+" "+yes.getName()+" "+yes.getLocation()+" "+yes.getRevenue()+" "+yes.getTax()+" "+yes.getSalary());
		}
		
		System.out.println();
		System.out.println("Here is your entered details in reverse order");
		System.out.println();
		
		while(li.hasPrevious()) {
			Factory yes = li.previous();
			System.out.println(yes.getNumber()+" "+yes.getName()+" "+yes.getLocation()+" "+yes.getRevenue()+" "+yes.getTax()+" "+yes.getSalary());
		}
	}
}
