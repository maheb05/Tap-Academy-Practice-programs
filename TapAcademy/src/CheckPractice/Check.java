package CheckPractice;

public class Check {
	public static void main(String[] args) {
		int x=100;
		int y;
		y=x;
		
		System.out.println(x);
		System.out.println(y);
		
		x=200;
		y=x; 
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		Car c=new Car();
		c.name="Polo";
		c.cost=20000;
		System.out.println(c.name);
		System.out.println(c.cost);
		c.start();
		System.out.println();
		
		Car d;
		d=c;
		System.out.println(d.name);
		System.out.println(d.cost);
		d.start();
		System.out.println();
		
		d.name="BMW";
		d.cost=40000;
		System.out.println(d.name);
		System.out.println(d.cost);
		d.start();
		System.out.println();
		
		Car e;
		e=d;
		System.out.println(c.name);
		System.out.println(c.cost);
		c.start();
		
	}

}

class Car{
	String name;
	int cost;
	void start() {
		System.out.println("Car Started");
	}
}
