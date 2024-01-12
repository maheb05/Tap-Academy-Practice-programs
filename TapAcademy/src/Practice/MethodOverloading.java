package Practice;

public class MethodOverloading {
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		System.out.println(calc.add(1.4546,8.355));
		System.out.println(calc.add(2,5 ));
	}
}



class Calculator{
	
	int add(int a,int b){
		return a+b;
	}
	
	float add(int a,float b){
		return a+b;
	}
	
	float add(float a, int b){
	return a+b;
	}
	
	double add(double a,double b){
		return a+b;
	}
}