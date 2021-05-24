import java.util.Scanner;

public class Practice {
	private static int j ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data();
		//checkLabel();
		InterClass iobj = new InterClass();
		iobj.display();
		iobj.getMarks(20, 30);
		
		MethodOverride mobj = new MethodOverride();
		mobj.getoverrideData();
		
		Abstraac aobj = new Absstrac();
		aobj.data1();
		aobj.data();
		
		CallMethods obj = new CallMethods();
		obj.data(3, 8);
		obj.sum();
		
		Constructor obj1 = new Constructor();
		obj1.conData();
		
		Constructor obj3 = new Constructor();
		obj3.conData();
		
		Constructor obj2 = new Constructor(3,7);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		Constructor obj4 = new Constructor(22,33);
		obj4.area();
		
		MethodOverloading object = new MethodOverloading();
		object.add(1);
		object.add(2, 4);
		object.add(2.22, 1);
		
		NestingNMethod obje = new NestingNMethod(3,9);
		obje.display();
		
		SingleInheritance ob = new SingleInheritance(3,4);
		ob.enterData();
		ob.multi();
		
		MultiInheritance mark = new MultiInheritance();
		mark.rollnumber();
		mark.Marks();
		mark.add();
		
		
		
		Hierara1 hobj1 = new Hierara1();
		hobj1.cl1();
		hobj1.sum();
		Hierara2 hobj = new Hierara2();
		hobj.multiply();
		
	
	}
	
	
	public static void data() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your no");
		int enterNum = sc.nextInt();
		System.out.println("enter no is " + enterNum);

		
		while(enterNum%2 != 0) {
			System.out.println("No is odd number");
			break;
		}
		sc.close();
		
		int i = 0;
		while ( i < 100) {
			if (i%2 == 0) {
				System.out.println("No is prime" +i);
			}
			i++;
		}
		
		
	}
	
	public static void loop () {
		
		for (j=0;j<100;j++) {
			if (j%2 ==0) {
				System.out.println("number is even number "+j)  ;
				
			}else {
				System.out.println("number is odd number "+j);
			}
		}
		
		
	}
	
	public static void loops () {
		
		for (j=0;j<100;j=j+2) {

		System.out.println("number is even number "+j);
	}
	
}
	
	public static void looping() {
		
		for(int k=1 ; k<6;k++) {
			for(int m =1;m<k;m++) {
				System.out.println("x");
			}
			System.out.println("\n");
		}
			
	}
	
	//jump out of loop break
	//skipping a part of loop - continue
	public static void jumpLoop() {
		
		for (int j =1;j<10;j++) {
			
			for(int k=1 ; k<5;k++) {
				System.out.println("x "+k);
				
			}
		}
		
		
	}
	
	public static void checkLabel() {
		
		for (int j =1;j<10;j++) {
			if (j==6) {
		      break;
			}
		      for(int k =1 ;k<=5 ;k++) {
		    	  System.out.println("x");
		    	  if(j==k) {
		    		  continue ;
		    	  }
		      }
		      System.out.println("");
			}
	}
	
}
