package ArrayList;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Grapes");
		al.add("Mango");
		System.out.println("ArrayList1 before addAll:" + al);

		// ArrayList2
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Fig");
		al2.add("Pear");
		al2.add("Banana");
		al2.add("Guava");
		System.out.println("ArrayList2 content:" + al2);

		// Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
		al.addAll(2, al2);
		System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n" + al);
	}

}
