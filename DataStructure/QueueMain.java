package QueueTwoStack;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue q = new Queue();
		System.out.println("Queue using Two Stacks Test\n");
		char ch;
		do{
			System.out.println("\n Queue Operations ");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. Check Empty");
			System.out.println("5. Size");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter integer element to insert");
				q.insert(scan.nextInt());
				break;
			
			case 2:
				try {
					System.out.println("Removed Element : "+q.remove());
				}catch (Exception e) {
					System.out.println("Error : "+e.getMessage());// TODO: handle exception
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element : "+q.peek());
				}catch (Exception e) {
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty Status : "+q.isEmpty());
				break;
			case 5:
				System.out.println("Size : "+q.getSize());
				break;
			default :
				System.out.println("Wrong Entry \n");
				break;
			}
			q.display();
			System.out.println("\n Do you want to continue (Type y or n)");
			ch = scan.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}

}

