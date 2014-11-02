package stacksQueues;

import java.util.Stack;

public class AscendStackOp {
	public static void main(String[] args) {
		try {
			AscendStack stack = new AscendStack();
			stack.push(45);
			stack.push(20);
			stack.push(37);
			System.out.println("Peeked item: " + stack.peek());
			stack.push(9);
			stack.push(50);
			stack.push(2);
			System.out.println("Peeked item: " + stack.peek());
			stack.push(30);
			stack.push(99);
			System.out.println("***First Stack***");
			for(int i = 0; i < 8; i++)
				System.out.println("Popped item: " + stack.pop());
			AscendStack newStack = new AscendStack();
			newStack.pushNormal(23);
			newStack.pushNormal(12);
			newStack.pushNormal(35);
			newStack.pushNormal(5);
			newStack.pushNormal(20);
			Stack<Integer> stack2 = sort(newStack);
			System.out.println("***Second Stack***");
			for(int i = 0; i < 5; i++)
				System.out.println("Popped item: " + stack2.pop());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Stack<Integer> sort(AscendStack theStack) {
		Stack<Integer> stack2 = new Stack<Integer>();
		try {
			while(!theStack.isEmpty()) {
				int temp = theStack.pop();
				while(!stack2.isEmpty() && stack2.peek() > temp)
					theStack.pushNormal(stack2.pop());
				stack2.push(temp);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return stack2;
	}
}