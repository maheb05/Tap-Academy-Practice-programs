   package collectionoops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String mail;
	private String department;
	private int salary;
	
	public Employee() {
		
	}
	

	public Employee(int id, String name, String mail, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.department = department;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee e2) {
		Employee e1 = this;
		
		if(e1.name.compareTo(e2.name)==0) {
			if(e1.department.compareTo(e2.department)==0) {
				if((e1.salary-e2.salary)==0) {
					return e1.id - e2.id;
				}
				else {
					return e1.salary-e2.salary;
				}
			}
			else {
				return e1.department.compareTo(e2.department);
			}
		}
		else {
			return e1.name.compareTo(e2.name);
		}
	}
}

class MyCompare implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		
		return id1.compareTo(id2);
	}
}

class MyCompare2 implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		return id1.compareTo(id2) *  -1;
	}
	
}

class MyCompare3 implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2) {
		Integer o = o1.getSalary();
		Integer p = o2.getSalary();
		
		return o.compareTo(p) * -1;
	}
}

public class One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How many employees");
		int n = scan.nextInt();
		scan.nextLine();
		
		MyCompare3 com = new MyCompare3();
		
		TreeSet<Employee> li = new TreeSet<Employee>(com);
		
		for(int i=0;i<n;i++) {
			
			String s = scan.nextLine();
			String[] ar = s.split(",");
			int id = Integer.parseInt(ar[0]);
			String name = ar[1];
			String mail = ar[2];
			String department = ar[3];
			int salary = Integer.parseInt(ar[4]);
			
			Employee e = new Employee(id,name,mail,department,salary);
			li.add(e);
		}
		
		Iterator<Employee> lite = li.iterator();
		
		while(lite.hasNext()) {
			Employee et = lite.next();
			System.out.println(et.getId()+" "+et.getName()+" "+et.getMail()+" "+et.getDepartment()+" "+et.getSalary());
		}
		
		
		
	}
}
