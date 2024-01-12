package collectionoops;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private String dob;
	private int age;
	private long mobile;
	public Student(int id, String name, String dob, int age, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.mobile = mobile;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}

public class Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many students");
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=0;i<n;i++) {
			String s = scan.nextLine();
			String[] ar = s.split(",");
			int id = 101+i;
			String name = ar[0];
			String dob = ar[1];
			int age = Integer.parseInt(ar[2]);
			long mobile = Long.parseLong(ar[3]);
			
			Student student = new Student(id,name,dob,age,mobile);
			list.add(student);
		}
		
		ListIterator<Student> li = list.listIterator();
		while(li.hasNext()) {
			Student yes = li.next();
			System.out.println(yes.getId()+" "+yes.getName()+" "+yes.getDob()+" "+yes.getAge()+" "+yes.getMobile());
		}
	}
}
