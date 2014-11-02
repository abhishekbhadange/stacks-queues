package stacksQueues;

import java.util.Stack;

public class AscendStack {
	private Stack<Integer> theStack, stack2;
	public AscendStack() {
		theStack = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	public void push(int data) {
		if(theStack.isEmpty()) {
			theStack.push(data);
			return;
		}
		while(!theStack.isEmpty() && data < theStack.peek())
			stack2.push(theStack.pop());
		theStack.push(data);
		while(!stack2.isEmpty())
			theStack.push(stack2.pop());
	}
	public void pushNormal(int data) {
		theStack.push(data);
	}
	public int pop() throws Exception {
		if(theStack.isEmpty())
			throw new Exception("Trying to pop from an empty stack.");
		return theStack.pop();
	}
	public int peek() {
		return theStack.peek();
	}
	public boolean isEmpty() {
		return theStack.size() == 0;
	}
}