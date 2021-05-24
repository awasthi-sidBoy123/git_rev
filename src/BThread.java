
public class BThread extends Thread {
	
	public void run () {
		
		for (int i = 1 ; i <5 ; i++) {
			System.out.println("This is B");
			
		}
		System.out.println("Exit B");
	}

}
