package JavaBasic;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;  /* 11 = 00001011 */
	     int num2 = 22;  /* 22 = 00010110 */
	     int result = 0;

	     result = num1 & num2;   
	     System.out.println("num1 & num2: "+result);

	     result = num1 | num2;   
	     System.out.println("num1 | num2: "+result);
	    
	     result = num1 ^ num2;   
	     System.out.println("num1 ^ num2: "+result);
	    
	     result = ~num1;   
	     System.out.println("~num1: "+result);
	    
	     result = num1 << 2;   
	     System.out.println("num1 << 2: "+result); result = num1 >> 2;   
	     System.out.println("num1 >> 2: "+result);
	}

}
