
public class MethodOverloading {

	int a,b;
	double c;
	
	
	void add(int x ){
	 
		a = x;
		System.out.println("Value is " +a);
	}
	
	void add(int x , int y) {
		
		a = x;
		b = y;
		System.out.println("Sum is "+ (a+b));
	}
	
	void add(double x , int y) {
	
		c = x;
		b = y;
		System.out.println("it is "+c);
	}
	
}
