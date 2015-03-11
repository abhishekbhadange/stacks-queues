package stacksQueues;

import java.util.Stack;

public class SetOfStacks2 {
	private int threshold;
	private int i = 0;
	private int noOfStacks;
	private Stack<Integer>[] stacks;
	public SetOfStacks2(int threshold, int noOfStacks) {
		this.threshold = threshold;
		this.noOfStacks = noOfStacks;
		stacks = (Stack<Integer>[])new Stack[noOfStacks];
		stacks[i] = new Stack<Integer>();
	}
	public void push(int value) throws Exception {
		if(stacks[i].size()+1 > threshold) {
			if(i+1 < noOfStacks) {
				i++;
				stacks[i] = new Stack<Integer>();
				stacks[i].push(value);
			}
			else {
				throw new Exception("Out of space!");
			}
		}
		else {
			stacks[i].push(value);
		}
	}
	public int pop() throws Exception {
		int value;
		if(stacks[i].isEmpty()) {
			if(i-1 >= 0) {
				i--;
				value = stacks[i].pop();
			}
			else {
				throw new Exception("Trying to pop from an empty stack!");
			}
		}
		else {
			value = (Integer)stacks[i].pop();
		}
		return value;
	}
	public int popAt(int index) throws Exception {
		int value;
		if(index <= i && !stacks[index].isEmpty()) {
			value = (Integer)stacks[index].pop();
		}
		else {
			throw new Exception("Trying to pop from empty stack no. " + index);
		}
		return value;
	}
}
