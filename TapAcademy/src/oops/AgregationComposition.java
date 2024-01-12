package oops;

class Charger{
	
	private String Brand;
	private float Voltage;
	
	public Charger(String Brand,float Voltage) {
		this.Brand = Brand;
		this.Voltage = Voltage;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public float getVoltage() {
		return Voltage;
	}
}

class OS{
	private String Name;
	private float Size;
	
	public OS(String Name,float Size) {
		this.Name = Name;
		this.Size = Size;
	}
	
	public String getName() {
		return Name;
	}
	
	public float getSize() {
		return Size;
	}
}

class Mobile{
	
	OS os = new OS("Android",512f);
	
	public void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}


public class AgregationComposition {
	public static void main(String[] args) {
		
		Charger d = new Charger("Samsung",44.3f);
		
		Mobile m = new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(d);
		m = null;
		
		//Mobile lost ....obviously os present inside mobile so OS also lost.......Charger is there we can directly access it b
		
		//m.hasA(d);
		//Charger D = new Charger("");
		System.out.println(d.getBrand());
		System.out.println(d.getVoltage());
		
	}

}
