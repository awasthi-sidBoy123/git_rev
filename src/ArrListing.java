import java.util.ArrayList;
import java.util.HashSet;

public class ArrListing {

	public static void main(String[] args) {

		max();

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr1 = new ArrayList<String>();

		arr.add("Java");
		arr.add("Programming");
		arr.add("Fun");
		
		arr1.add("Java");
		arr1.add("Programming");
		arr1.add("good");
		System.out.println(arr);
		System.out.println(arr.contains("Fun"));

		System.out.println(arr.get(2));
		//Checks if both contains same strings or not
		System.out.println(arr.containsAll(arr1));
		System.out.println(arr1);
		
		//To find the index of an element of an array
		System.out.println(arr1.indexOf("Java"));
		System.out.println(arr1.get(1));
		//To check if empty
		System.out.println(arr1.isEmpty());
		
		//To check the size
		System.out.println(arr1.size());
		sets();
	}
	
	public static void sets() {
		HashSet<String> hs = new HashSet<String>();
		//It does not accept duplicate values
		hs.add("Data");
		hs.add("Data");
		hs.add("of");
		hs.add("hashset");
		System.out.println(hs);
		System.out.println(hs.remove("Data"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty() );
		
		
	}
	
	public static void max() {
		
	    int arr [][] = {{1,4,6},{3,5,8},{2,7,2}};
	    int i , j;
	    int max = arr[0][0];
	   int columnNo = 0;
	    int k=0;
	    System.out.println("Length of array "+arr.length);
	    for(i=0;i<arr.length;i++) {
	    	
	    	for(j=0;j<arr.length;j++) {
	    		if(arr[i][j]>max) {
	    			max = arr[i][j];
	    			columnNo = j;
	    		}
	    	}
			System.out.println("Column no is "+columnNo);
		    System.out.println("Max value is "+max);

	     }
	    int min = arr[0][columnNo];
		while(k<3) {
			if (arr[k][columnNo]<min) {
				min = arr[k][columnNo];
			}
			k++;

		}
		System.out.println("Min value is "+min);

		
	}
	
	

}
