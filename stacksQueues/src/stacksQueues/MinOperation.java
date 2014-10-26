package stacksQueues;

public class MinOperation {
	public static void main(String[] args) {
		MinOpStack theStack = new MinOpStack();
		theStack.push(23);
		theStack.push(12);
		theStack.push(54);
		theStack.push(5);
		theStack.push(60);
		int temp = theStack.pop();
		System.out.println("Popped Item: " + temp);
		int min = theStack.min();
		System.out.println("Min Item: " + min);
		temp = theStack.pop();
		System.out.println("Popped Item: " + temp);
		min = theStack.min();
		System.out.println("Min Item: " + min);
		theStack.push(1);
		min = theStack.min();
		System.out.println("Min Item: " + min);
	}
}	