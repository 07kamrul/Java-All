package Sorting;

public class SelectionSort {
	public static void SelectionSort(int[] a) {
		for(int i = 0 ; i < a.length - 1 ; i++) {
			int index = i;
			for(int j = 0 ; j < a.length ; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			int smallerNumber = a[index];
			a[index] = a[i];
			a[i] = smallerNumber;
		}
	}





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
