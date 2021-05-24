import java.util.Scanner;

public class MultiInheriti extends MultiInherit {
	
	int mark1;
	int mark2;
	void Marks() {
		Scanner sc = new Scanner(System.in);
		 mark1 = sc.nextInt();
		System.out.println("Mark1 is "+mark1);
		 mark2 = sc.nextInt();
		System.out.println("Mark2 is " +mark2);
		sc.close();
	}

}
