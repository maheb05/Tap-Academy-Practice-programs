package oops;

class Heart{
	 private float Weight;
	 private int Bpm;
	 
	 public Heart(float Weight,int Bpm) {
		 this.Weight = Weight;
		 this.Bpm = Bpm;
	 }
	 
	 public float getWeight() {
		 return Weight;
	 }
	 
	 public int getBpm() {
		 return Bpm;
	 }
}

class Brain{
	private float Weight;
	private String Color;
	
	public Brain(float Weight,String Color) {
		this.Weight = Weight;
		this.Color = Color;
	}
	
	public float getWeight() {
		return Weight;
	}
	
	public String getColor() {
		return Color;
	}
}

class Bike{
	private String Brand;
	private float Mileage;
	
	public Bike(String Brand,float Mileage) {
		this.Brand = Brand;
		this.Mileage = Mileage;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public float getMileage() {
		return Mileage;
	}
}

class Book{
	private String Name;
	private String Author;
	
	public Book(String Name,String Author) {
		this.Name = Name;
		this.Author = Author;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAuthor() {
		return Author;
	}
}

class Student{
	
	Heart h = new Heart(150.4f,72);
	Brain b = new Brain(100.4f,"White");
	
	void hasA(Bike bi) {
		System.out.println("Bike Name is "+bi.getBrand());
		System.out.println("Bike Mileage is "+bi.getMileage());
	}
	
	void hasB(Book bb) {
		System.out.println("Book Name is "+bb.getName());
		System.out.println("Book Author Name is "+bb.getAuthor());
	}
}

public class AgregationComposition2 {
	public static void main(String[] args) {
		
		Bike B = new Bike("Continental",23);
		Book BB = new Book("java","James Gossling");
		
		Student s = new Student();
		
		System.out.println(" Weight of Heart is "+s.h.getWeight());
		System.out.println(" HeartBeat per Minute "+s.h.getBpm());
		System.out.println();
		
		System.out.println(" Weight of Brain is "+s.b.getWeight());
		System.out.println(" Color of a Brain is "+s.b.getColor());
		System.out.println();
		
		s.hasA(B);
		System.out.println();
		s.hasB(BB);
		
		s = null;
		
//		s.hasA(B);
		
//		System.out.println(B.getBrand());
//		System.out.println(B.getMileage());
//		
//		System.out.println();
//		
//		System.out.println(BB.getName());
//		System.out.println(BB.getAuthor());
	}

}
