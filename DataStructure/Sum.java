package SumofArrayElementsUsingRecursion;

public class Sum {
	static int arr[] = {1,2,3,4,5};
	static int funSum(int a[],int n) {
		if(n <= 0) {
			return 0;
		}
		return (funSum(a, n-1)+a[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(funSum(arr, arr.length));
		
	}
}
