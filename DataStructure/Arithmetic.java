package SwapTwoValue;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping 01 : "+"x 1 : "+x+" ; y 1 : "+y);
		
		int x2 = 10;
		int y2 = 5;
		x2 = x2 * y2;
		y2 = x2 / y2;
		x2 = x2 / y2;
		System.out.println("After swaping 02 : "+"x2 : "+x2+" ; y2 : "+y2);
		
		int x3 = 10;
		int y3 = 5;
		x3 = x3 ^ y3;
		y3 = x3 ^ y3;
		x3 = x3 ^ y3;
		System.out.println("After swaping 03 : "+"x3  : "+x3+" ; y3 : "+y3);
		
		
	}

}
