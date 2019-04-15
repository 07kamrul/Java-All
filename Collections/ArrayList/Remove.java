package ArrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("AB");
		al.add("CD");
		al.add("EF");
		al.add("GH");
		al.add("AB");
		al.add("YZ");
		System.out.println("ArrayList before remove:");
		for (String var : al) {
			System.out.println(var);
		}
		// Removing 1st element
		al.remove(0);
		// Removing 3rd element from the remaining list
		al.remove(2);
		// Removing 4th element from the remaining list
		al.remove(2);
		System.out.println("ArrayList After remove:");
		for (String var2 : al) {
			System.out.println(var2);
		}
	}

}
