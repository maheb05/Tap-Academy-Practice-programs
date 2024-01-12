package multiThreading;

class Queue{
	int x ;
	
	void store(int j) {
		x = j;
		System.out.println("Produced "+ x);
	}
	
	void retrieve() {
		System.out.println("Consumed "+x);
	}
}


class Producer extends Thread{
	
	Queue a;
	
	Producer(Queue q){
		a = q;
	}
	
	public void run() {
		int i =1;
		for(;;) {
			a.store(i++);
		}
	}
}

class Consumer extends Thread{
	Queue b;
	
	Consumer(Queue q){
		b = q;
	}
	
	public void run() {
		for(;;) {
			b.retrieve();
		}
	}
}

public class Producer_Consumer_Problem {
	public static void main(String[] args) {
		
	Queue q = new Queue();
	
	Producer p = new Producer(q);
	Consumer c = new Consumer(q);
	
	p.start();
	c.start();
	
	}
}
