package stacksQueues;

//import java.util.Stack;
import java.util.ArrayList;

/*public class SetOfStacks extends Stack<Object> {
	int pushCount = 0, popCount = 0, capacity;
	Stack<Integer> s2, temp;
	public SetOfStacks(int capacity) {
		s2 = new Stack<Integer>();
		this.capacity = capacity;
	}
	public void push(int data) {
		if(pushCount == capacity) {
			if(temp == null)
				super.push(s2);
			else
				super.push(temp);
			temp = new Stack<Integer>();
			pushCount = 0;
		}
		if(temp == null) {
			s2.push(data);
			pushCount++;
		}
		else {
			temp.push(data);
			pushCount++;
		}
	}
	public Integer pop() {
		int value = 0;
		if(temp == null) {
				if(!s2.isEmpty()) {
					value = s2.pop();
					return value;
				}
		}
		if(!temp.isEmpty() && popCount != 5) {
			value = temp.pop();
			popCount++;
			return value;
		}
		if(!super.isEmpty()) {
			temp = (Stack<Integer>) super.pop();
			popCount = 0;
			if(!temp.isEmpty()) {
				value = temp.pop();
				popCount++;
			}
		}
		return value;
	}
}*/

public class SetOfStacks {
	ArrayList<SetStack> stacks = new ArrayList<SetStack>();
	public int capacity;
	public SetOfStacks(int capacity) {
		this.capacity = capacity;
	}
	public void push(int value) {
		SetStack last = getLastStack();
		if(last != null && !last.isFull())
			last.push(value);
		else {
			SetStack theStack = new SetStack(capacity);
			theStack.push(value);
			stacks.add(theStack);
		}
	}
	public int pop() {
		SetStack last = getLastStack();
		int value = last.pop();
		if(last.size == 0)
			stacks.remove(stacks.size() - 1);
		return value;
	}
	public SetStack getLastStack() {
		if(stacks.size() == 0)
			return null;
		return stacks.get(stacks.size() - 1);
	}
	public boolean isEmpty() {
		SetStack last = getLastStack();
		return last == null || last.isEmpty();
	}
	public int popAt(int index) {
		return leftShift(index, true);
	}
	public int leftShift(int index, boolean removeTop) {
		SetStack stack = stacks.get(index);
		int removed_item;
		if(removeTop)
			removed_item = stack.pop();
		else
			removed_item = stack.removeBottom();
		if(stack.isEmpty())
			stacks.remove(index);
		else if(stacks.size() > index + 1) {
			int value = leftShift(index + 1, false);
			stack.push(value);
		}
		return removed_item;
	}
}