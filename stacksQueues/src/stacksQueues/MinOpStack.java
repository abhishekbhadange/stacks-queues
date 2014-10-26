// Min operation stack with push, pop and min operations taking O(1) time

package stacksQueues;

import java.util.Stack;

public class MinOpStack extends Stack<Integer> {
	public Stack<Integer> s2;
	public MinOpStack() {
		s2 = new Stack<Integer>();
	}
	public void push(int data) {
		if(data <= min())
			s2.push(data);
		super.push(data);
	}
	public Integer pop() {
		int value = super.pop();
		if(value == min())
			s2.pop();
		return value;
	}
	public int min() {
		if(s2.empty())
			return Integer.MAX_VALUE;
		else
			return s2.peek();
	}
} 