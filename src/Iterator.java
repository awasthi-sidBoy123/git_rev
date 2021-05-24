import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Iterator {

	public static void main(String[] args) {

		data();
		hashMapp();
		uniqueNumber();
	}
	
	public static void uniqueNumber() {
		ArrayList<Integer> arraa = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();

		int k;
		int arr[] = {1,2,1,3,4,2,3,1,7,8,7,9};
		for(int i = 0 ;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(!hs.contains(arr[i])) {
				for( k = 0;k<arr.length;k++) {
					if (arr[i] == arr[k]) {
					//System.out.println(arr[k]);
						arraa.add(arr[k]);
						hs.add(arr[k]);
					}
				}
	            System.out.println(hs);
				System.out.println("size "+arr[i]+" " +arraa.size());

		}
			if(arraa.size() == 1) {
				System.out.println(arr[i] + " is unique number of this array.");
			}
				arraa.removeAll(arraa);
		}
		
		
	}
	
	
	
	
	
	
	
	@SuppressWarnings("rawtypes")
	public static void hashMapp() {
		HashMap<Object,Object> hm = new HashMap<Object,Object>();
		hm.put(0, "Data");
		hm.put("1", "is");
		hm.put("2", "good");
		hm.put(3, "to");
		hm.put(4, "learn");

		System.out.println(hm);
		
		HashMap<Integer,String> hv = new HashMap<Integer,String>();
		hv.put(0, "This");
		hv.put(1, "is");
		hv.put(2,"First");
		hv.put(3, "Value");
		//For each is used to provide action to all the key value pairs
		Set sn = hv.entrySet();
		java.util.Iterator it = sn.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			me.getKey();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		

		for (Map.Entry mapSet : hm.entrySet()) {
			Object a = mapSet.getKey();
			System.out.println(a);
			Object b = mapSet.getValue();
			System.out.println(b);
		}
	}
	
	public static void data() {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("programming");
		arr.add("is");
		arr.add("fun");
		arr.add("I");
		arr.add("Love");
		arr.add("java");
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("is");
		hs.add("owsm");
		hs.add("to");
		hs.add("learn");
		java.util.Iterator<String> iterate = hs.iterator();
	//	System.out.println(iterate.next());
		java.util.Iterator<String> iterater = arr.iterator();
	//	System.out.println(iterater.next());
//		
//		while(iterate.hasNext()) {
//			System.out.println(iterate.next());
//		}
		
		System.out.println("");
		int k =0;
		while(iterater.hasNext()) {
			System.out.println(iterater.next());
			System.out.println("element index "+k);
//			if(iterater.next()=="I") {
//				System.out.println(arr.indexOf("I"));
//				System.out.println("We got it");
//				break;
//			}
			k++;
		}
	}

}
