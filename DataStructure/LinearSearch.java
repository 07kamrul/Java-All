package Searching;

public class LinearSearch {

	public static int linearSearch(int[] a, int key) {
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {10,20,30,40,50,60,70};
		int key = 50;
		System.out.println(key+" is found : "+linearSearch(a1, key));
	}

}
