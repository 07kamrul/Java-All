package Sorting;


public class SelectionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {9,5,6,7,8,15,36,25,41,68};
		System.out.println("Befor Selection Sort");
		for(int i : a1) {
			System.out.println(i+ " ");
		}
		System.out.println();
		SelectionSort ss = new SelectionSort();
		ss.SelectionSort(a1);
		System.out.println("After Selection Sort");
		for(int i : a1) {
			System.out.println(i+" ");
		}
	}

}
