package Practice;

class Car{
	int seats;
	float milaege;
	String name;
	char start;
	boolean know;
}

public class HeloTap {
//	public static void main(String[] args) {
//		System.out.println("HELLO TAP");
//	}
	public static void main(String[] args) {
		Car c = new Car();
	    System.out.println(c.seats);
	    System.out.println(c.milaege);
	    System.out.println(c.name);
	    System.out.println(c.start);
	    System.out.println(c.know);
	    
	    c.seats=2;
	    System.out.println(c.seats);
	}

}
