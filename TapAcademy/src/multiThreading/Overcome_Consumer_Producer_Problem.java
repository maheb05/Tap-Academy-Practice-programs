package multiThreading;

class Queuee{
	
	int x ;
	
	boolean is_data_present=false;
	synchronized void store(int j) {
		try {
			if(is_data_present==false) {
				x = j;
				System.out.println("Produced "+x);
				is_data_present=true;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			System.out.println("Something went Wrong");
		}
	}
	
	synchronized void retrieve() {
		try {
			if(is_data_present==true) {
				System.out.println("Consumed "+x);
				is_data_present=false;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
}

class Producerr extends Thread{
	Queuee a;
	Producerr(Queuee q){
		a = q;
	}
	public void run() {
		int i=1;
		for(;;) {
			a.store(i++);
		}
	}
}

class Consumerr extends Thread{
	Queuee b;
	Consumerr(Queuee q){
		b = q;
	}
	
	public void run() {
		for(;;) {
			b.retrieve();
		}
	}
}

public class Overcome_Consumer_Producer_Problem {
	public static void main(String[] args) {
		Queuee q = new Queuee();
		
		Producerr p = new Producerr(q);
		Consumerr c = new Consumerr(q);
		
		p.start();
		c.start();
	}

}
