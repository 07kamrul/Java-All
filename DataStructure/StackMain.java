package Stack.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		try {
			s.push(5);
			s.push(10);
			s.push(15);
			s.push(20);
			s.push(25);
			s.pop();
			s.push(30);
			s.push(35);
			s.push(40);
			s.push(45);
			s.push(50);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			s.pop();
			s.pop();
			s.pop();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
