
public class AThread extends Thread {

	public void run () {
		for (int i =1; i<5 ; i++) {
			System.out.println("Thread A" +i);
		}
		System.out.println("Out of thread A");
	}
}
