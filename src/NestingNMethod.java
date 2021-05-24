
public class NestingNMethod {
	
	int a ,b;
	NestingNMethod(int x, int y){
		
		a = x  ;
		b = y ;
	}

	int largestValue()
	{
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	void display() {
		System.out.println("Largest value is " + largestValue());
	}
}
