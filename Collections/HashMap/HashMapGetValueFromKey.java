package HashMap;

import java.util.HashMap;

public class HashMapGetValueFromKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		// add elements to HashMap
		hmap.put(1, "AA");
		hmap.put(2, "BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");

		// Getting values from HashMap
		String val = hmap.get(4);
		System.out.println("The Value mapped to Key 4 is:" + val);

		/*
		 * Here Key "5" is not mapped to any value so this operation returns null.
		 */
		String val2 = hmap.get(5);
		System.out.println("The Value mapped to Key 5 is:" + val2);
	}

}
