  
public class Constructor {

 	int a,b ;

 	int area ;
	
	Constructor(){
		a=10;
		b=20;
	}

	
	Constructor(int x, int y){
		a = x;
		b =y;
		System.out.println(a*a);
	}
	
	void conData() {
		System.out.println(a);
		System.out.println(b);
	}
	
	void area() {
		area = a * b;
		System.out.println(area);
	}
}
