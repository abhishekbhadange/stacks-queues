package stacksQueues;

public class SetOfStacksOp {
	public static void main(String[] args) {
		SetOfStacks theStack = new SetOfStacks(5);
		for(int i = 0; i < 4; i++)
			theStack.push(i + 1);
		for(int i = 0; i < 4; i++) {
			int temp = theStack.pop();
			System.out.println("Popped Item: " + temp);
		}
	}
}