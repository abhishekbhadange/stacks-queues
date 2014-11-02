package stacksQueues;

public class SetStack {
	private int capacity;
	public SetNode top, bottom;
	public int size = 0;
	public SetStack(int capacity) {
		this.capacity = capacity;
	}
	public boolean isFull() {
		return size == capacity;
	}
	public void join(SetNode above, SetNode below) {
		if(below != null)
			below.above = above;
		if(above != null)
			above.below = below;
	}
	public boolean push(int v) {
		if(size >= capacity)
			return false;
		size++;
		SetNode n = new SetNode(v);
		if(size == 1) 
			bottom = n;
		join(top, n);
		top = n;
		return true;
	}
	public int pop() {
		SetNode t = top;
		top = top.above;
		size--;
		return t.value;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public int removeBottom() {
		SetNode b = bottom;
		bottom = bottom.above;
		if(bottom != null)
			bottom.below = null;
		size--;
		return b.value;
	}
}