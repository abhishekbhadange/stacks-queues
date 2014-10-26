package stacksQueues;

public class ThreeStacksSingleArray {
	public static void main(String[] args) {
		CustomStack theStack = new CustomStack(3);	
		try {
			theStack.push(9, 0);
			theStack.push(6, 0);
			theStack.push(3, 0);
			theStack.push(12, 1);
			theStack.push(8, 1);
			theStack.push(4, 1);
			theStack.push(15, 2);
			theStack.push(10, 2);
			theStack.push(5, 2);
			int temp1 = theStack.pop(0);
			System.out.println("Temp1: " + temp1);
			int temp12 = theStack.pop(0);
			System.out.println("Temp12: " + temp12);
			int temp13 = theStack.pop(0);
			System.out.println("Temp13: " + temp13);
			int temp2 = theStack.pop(1);
			System.out.println("Temp2: " + temp2);
			int temp3 = theStack.pop(2);
			System.out.println("Temp3: " + temp3);
			theStack.push(30, 0);
			temp1 = theStack.pop(0);
			System.out.println("Temp1: " + temp1);
			theStack.push(30, 1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}