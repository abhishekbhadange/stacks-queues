package stacksQueues;

public class CustomStack {
	private int stackSize;
	private int[] buffer;
	private int[] stackPointer = {-1, -1, -1};
	public CustomStack(int size) {
		stackSize = size;
		buffer = new int[3 * stackSize];
	}
	public void push(int data, int stackNum) throws Exception {
		if(stackPointer[stackNum] + 1 >= stackSize)
			throw new Exception("Out of space.");
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = data;
	}
	public int pop(int stackNum) throws Exception {
		if(stackPointer[stackNum] == -1)
			throw new Exception("Trying to pop an empty stack.");
		int value = buffer[absTopOfStack(stackNum)];
		buffer[absTopOfStack(stackNum)] = 0;
		stackPointer[stackNum]--;
		return value;
	}
	public int peek(int stackNum) {
		int index = absTopOfStack(stackNum);
		return buffer[index];
	}
	public boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == -1;
	}
	public int absTopOfStack(int stackNum) {
		return stackNum * stackSize + stackPointer[stackNum];
	}
}