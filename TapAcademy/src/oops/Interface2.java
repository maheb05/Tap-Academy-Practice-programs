package oops;

interface Calci{
	abstract void add();
	abstract void sub();
}


class Calci1 implements Calci{
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	public void sub() {
		int a = 90;
		int b = 100;
		System.out.println(a-b);
	}
	
	public void mul(){
		int a = 10;
		int b = 20;
		System.out.println(a*b);
	}
}

class Matha{
	public void pro(Calci c) {
		c.add();
		c.sub();
	}
}
public class Interface2 {
	public static void main(String[] args) {
		Calci1 m1 = new Calci1();
		
		Matha m = new Matha();
		m.pro(m1);
		((Calci1)(m1)).mul();
		m1.mul();
	}
}
