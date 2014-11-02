package stacksQueues;

import java.util.Stack;

public class Tower {
	private Stack<Integer> disks;
	private int index;
	public Tower(int value) {
		disks = new Stack<Integer>();
		index = value;
	}
	public int index() {
		return index;
	}
	public void add(int data) {
		if(!disks.isEmpty() && disks.peek() <= data)
			System.out.println("Error placing disk " + data);
		else
			disks.push(data);
	}
	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
	}
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if(n > 0) {
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}
	public void printTower(int n) {
		for(int i = 0; i < n; i++) {
			int temp = disks.pop();
			System.out.println("Popped Item: " + temp);
		}
	}
}