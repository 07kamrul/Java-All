package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsInAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Kamrul");
		al.add("Daud");
		al.add("Refat");
		al.add("Anik");
		al.add("Ana");
		al.add("Joye");

		System.out.println("ArrayList before Swap:");
		for (String temp : al) {
			System.out.println(temp);
		}

		// Swapping 2nd(index 1) element with the 5th(index 4) element
		Collections.swap(al, 1, 4);

		System.out.println("ArrayList after swap:");
		for (String temp : al) {
			System.out.println(temp);
		}
	}

}
