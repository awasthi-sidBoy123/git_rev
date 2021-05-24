package NewPractice;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statements();
	}
	
	public static void multiplication() {
		
		int i;
		
		for (i=1 ; i<=10;i++) {
			int result = 5 * i;
			System.out.println("5 * "+i+" = "+result );
		}
		
	}
	
	public static void statements() {
		int a = 1 ; int b = 2;
		int c = 4 ; int d = 2;
		
		if((a+b)> (c+d)) {
			System.out.println("It is greater");
		}else {
			System.out.println("It is smallest");
		}
		
		int angle1 = 60;
		int angle2 = 60;
		int angle3 = 60;
		
		if ((angle1+angle2+angle3) == 180 ) {
			System.out.println("triangle");
		}else {
			System.out.println("not a triangle");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your no");
		int enterNum = sc.nextInt();
		if(enterNum%2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is not even");
		}
		
	}

}
 