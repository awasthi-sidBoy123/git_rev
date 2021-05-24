
public class ArrayPractice { 
	
	static int firstArray [] = {1,2,3,4,5};
	static int arr [] = new int [8] ;
	static int arra1 [] = new int [8];
    static int i;
    static int j;
	public static void main(String[] args) {
  		
		System.out.println(firstArray.length);
		
		check();
		
		for(i=0;i<8;i++) {
			
			arr[i] = i;
			System.out.println(arr[i]);
		}
		

	}
	
	static void check() {
		
		for(j=0;j<8;j++) {
			arra1[j] = j;
			System.out.println(arra1[j]);
		}
		
		System.out.println(arra1.length);
		
	}

}
