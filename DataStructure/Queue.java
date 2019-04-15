package QueueTwoStack;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue {

	Stack<Integer> s ;
	Stack<Integer> tmp ;
	
	public Queue() {
		s = new Stack<Integer>();
		tmp = new Stack<Integer>();
	}
	void insert(int data) {
		if(s.size() == 0) {
			s.push(data);
		}
		else {
			int l = s.size();
			for(int i = 0 ; i < l ; i++ ) {
				tmp.push(s.pop());
			}
				s.push(data);
			for(int i = 0 ; i < l; i++ ) {
				s.push(tmp.pop());
			}
			
		}
	}
	public int remove() {
		if(s.size()==0) {
			throw new NoSuchElementException("underflow Exception");
		}
		return s.pop();
	}
	public int peek() {
		if(s.size()==0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return s.peek();
	}
	public boolean isEmpty() {
		return s.size() == 0;
	}
	public int getSize() {
		return s.size();
	}
	public void display() {
		System.out.println("\n Queue : ");
		int l = getSize();
		if(l == 0) {
			System.out.println("Empty \n");
		}
		else {
			for(int i = l - 1 ; i >= 0 ; i++) {
				System.out.println(s.get(i)+" ");
				System.out.println();
			}
		}
	}
}
