
public class SingleInherit {
	
	int a , b;
	 SingleInherit(int x, int y) {
		
		a = x;
		b = y;
	}
	
	int enterData() {
		int c = a + b;
		System.out.println("Super class" +c);
		return(c);
	}

}
