
public class SingleInheritance extends SingleInherit {

	SingleInheritance(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	} 

	int multi() {
		
		int c = a * b;
		System.out.println("SubClass " +c);
		return c;
	}
}
