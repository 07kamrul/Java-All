package Stack.Stack;

public class Stack {
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public Stack(int size) {
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}
	
	public void push(int entry) throws Exception {
		if(this.isStackFull()) {
			throw new Exception("Stack is full");
		}
		System.out.println("Adding : "+entry);
		this.stackArr[++top] = entry;
	}
	
	public int pop() throws Exception {
		if(this.isStackEmpty()) {
			throw new Exception("Stack is empty");
		}
		int entry = this.stackArr[top--];
		System.out.println("Remove entry : "+entry);
		return entry;
	}
	public int peek() {
		return stackArr[top];
	}

	private boolean isStackEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	private boolean isStackFull() {
		// TODO Auto-generated method stub
		return (top == stackSize - 1);
	}
	

}
