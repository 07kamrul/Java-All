package ArrayList;

import java.util.ArrayList;

public class AddRemoveElementsFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		// Displaying elements
		System.out.println("Original ArrayList:");
		for (String str : obj)
			System.out.println(str);

		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		// Displaying elements
		System.out.println("ArrayList after add operation:");
		for (String str : obj)
			System.out.println(str);

		// Remove elements from ArrayList like this
		obj.remove("Chaitanya"); // Removes "Chaitanya" from ArrayList
		obj.remove("Harry"); // Removes "Harry" from ArrayList

		// Displaying elements
		System.out.println("ArrayList after remove operation:");
		for (String str : obj)
			System.out.println(str);

		// Remove element from the specified index
		obj.remove(1); // Removes Second element from the List

		// Displaying elements
		System.out.println("Final ArrayList:");
		for (String str : obj)
			System.out.println(str);
	}

}
