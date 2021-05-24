import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Begin {
	
	static int a = 3;
	static int b = 4;
	static int sum ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dateVal();
		minMaxColumn();
		largestNumber();
		smallesNumber();
		arr();
		nestedLoop();
		
		Da();
		
		doloop();
		
	
		
		AThread ob = new AThread();
		ob.start();
		
		BThread obc = new BThread();
		obc.start();
		
		sumOfNo();
		
		 int a1 = 2;
		 int b1 = 3;
		 int sum1 ;
		 sum1 = a1 + b1;														
		System.out.println(sum1);
		
		CommonCode obj = new CommonCode();
		obj.headerLink();
		obj.returnData();
		System.out.println(obj.returnData());
		    
		takeInput();
		Da();
		palin();
		
	}
	
	public static String dateVal() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeZone()) ;
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(DateTimeFormatter.ofPattern("dd hh:mm:ss",Locale.ENGLISH).format(ldt));
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss",Locale.ENGLISH).format(ldt));
		String value = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss",Locale.ENGLISH).format(ldt);
		return value;
		
	}
	
	public static void minMaxColumn() {
		System.out.println(dateVal());  
		int arr [][] = {{5,4,7},{9,1,4},{2,5,0}};
		int min = arr[0][0];
		int columnNo = 0 ;
        		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ; j < arr.length; j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
					columnNo = j;
				}
			}
		}
		System.out.println("Column no is  "+columnNo);

		int maxNumber = arr[0][columnNo];
		int k = 0;
		while(k<3) {
		      
			if (arr[k][columnNo]>maxNumber) {
				maxNumber = arr[k][columnNo];
			}
			k++;
		}
		System.out.println("max "+maxNumber);
	}
	
		public static void nestedLoop() {
		int i , j , l ,m ;
		for(i=1;i<6;i++) {
			System.out.println(" ");
			for(j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
		}
		System.out.println("");
		
		for(l=5;l>0;l--) {
			System.out.println("");
			for(m=l;m>0;m--) {
				System.out.print("*");
			}
		}
		System.out.println("");
		
		int n = 1;
		for (int k =0; k<5 ; k++) {
			System.out.println("");
			for(int g = 1; g<=4-k;g++) {
				System.out.print(n);
				System.out.print(" ");
				n++;
			}
			
		}
			int a = 1;
			for(int b = 1; b<5 ;b++) {
				System.out.println("");
				for(int c=1;c<=b;c++) {
					System.out.print(a);
					System.out.print(" ");
		            a++; 	
				}
			}
			System.out.println("");	
			
			
			for(int d = 1;d<5 ;d++) {
				System.out.println("");
				for(int e = 1; e<=d ; e ++) {
					System.out.print(e);
					System.out.print(" ");
				}
			}
			System.out.println("");
			
			
			int f = 1;
			for(int g = 1 ; g < 5 ;g++) {
				System.out.println("");
				for(int h = 1 ; h <=g;h++) {
					System.out.print(f);
					System.out.print(" ");
				}
				f++;
			}
			System.out.println("");
			
			int s = 3;
			for(int p = 0 ; p<4 ; p++) {
				System.out.println("");
				for(int q=1 ; q < p+1 ; q++) {
					System.out.print(s);
					System.out.print(" ");
					s = s+3;
				}
			}
			System.out.println("");
	}
	
	
	public static void arr() {
		
		int [][] a= new int[3][3];
		a[0][0] = 11;
		a[0][1] = 21;
		a[0][2] = 31;
		a[1][0] = 41;
		a[1][1] = 51;
		a[1][2] = 61;
		a[2][0] = 71;
		a[2][1] = 81;
		a[2][2] = 91;
		System.out.println(a.length);
		
		for (int i = 0 ; i<a.length;i++) {
			System.out.println("");
			for(int j =0;j<a.length;j++) {
				System.out.println(a[i][j]);
			}
		}

		}
	
	public static void smallesNumber() {
		
		int arr [][] = {{5,4,7},{9,1,4},{2,5,0}};
		int min = arr[0][0];
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ; j < arr.length; j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Min value is "+min);
		
	}
	
	public static void largestNumber() {
		 int arr [][] = {{6,8,6},{2,5,4},{8,9,16}};
		 
		 int max = arr[0][0];
		 
		 for(int i = 0; i<arr.length;i++) {
			 for(int j =0; j<arr.length;j++) {
				 if(arr[i][j]>max) {
					 max = arr[i][j];
				 }
			 }
		 }
		 System.out.println("Max value is "+max);
	}
	
	
	public static void Da()
	{
		String convertIntString = "132123";
		double r = 100.4566;
		int aa = (int) r;
		System.out.println(aa);
		
		int ss = 40;
		String s = "Good";
		//To find the index of single character of string
		int da =  s.indexOf("d");
		//To find the value at index 3
		char ano = s.charAt(3);
		System.out.println("Index of "+ano);
		System.out.println("Char at "+da);
		System.out.println(s.charAt(2));
		
		//Substring
		
		String number = "123456780";
		String subNumber = number.substring(2, 8);
		System.out.println(number.subSequence(1, 7));
		System.out.println("subnumber is " +subNumber);
		
		//Concatenate 
		String stringOne = "Data";
		String stringTwo = "Value";
		System.out.println("String Concat "+stringOne.concat(stringTwo));
		
	
		
		int val = Integer.parseInt(convertIntString);
		System.out.println("Converted string is "+val);
		
	    String value = String.valueOf(ss);
	    System.out.println("Converted int is "+value);
	}
	
	public static void doloop() {
		int i = 10;
		do {
			System.out.println("value of i "+i);
			i++;
			System.out.println("increased value "+i);
		}while(i<20); {
			System.out.println("value of i after 20 "+i);
		}
	}
	
	public static String palin() {
		String palindrome = "madam";
		int len = palindrome.length();
		System.out.println("length is "+len);
		String t = "";
		for (int i = palindrome.length()-1;i>=0;i--) {
			t = t + palindrome.charAt(i);
			System.out.println(t);
		}
		System.out.println("output is "+t);
		
		if (t.equalsIgnoreCase(palindrome)) {
			System.out.println("Sucess");
		}else {
			System.out.println("Fail");
		}
		return t;
	}

	public static void sumOfNo()
	{
		sum = a + b;
		System.out.println(sum);
	}
	
	public static void takeInput  () {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String str = sc.nextLine();
		System.out.println("Name is "  + str);
	}
}
