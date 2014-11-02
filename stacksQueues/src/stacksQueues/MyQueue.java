package stacksQueues;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> stack1, stack2;
	public MyQueue() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	public int size() {
		return stack1.size() + stack2.size();
	}
	public void enqueue(int data) {
		if(stack2.isEmpty())
			stack1.push(data);
		else {
			while(!stack2.isEmpty())
				stack1.push(stack2.pop());
			stack1.push(data);
		}
	}
	public int dequeue() throws Exception {
		if(stack1.isEmpty() && stack2.isEmpty())
			throw new Exception("Trying to pop from an empty stack.");
		if(stack1.isEmpty() && !stack2.isEmpty())
			return stack2.pop();
		while(stack1.size() != 1)
			stack2.push(stack1.pop());
		return stack1.pop();
	}
	public int peek() throws Exception {
		if(stack1.isEmpty() && stack2.isEmpty())
			throw new Exception("Trying to peek from an empty stack.");
		if(stack1.isEmpty() && !stack2.isEmpty())
			return stack2.peek();
		while(stack1.size() != 1)
			stack2.push(stack1.pop());
		return stack1.peek();
	}
}