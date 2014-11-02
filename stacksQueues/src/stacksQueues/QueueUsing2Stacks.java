package stacksQueues;

public class QueueUsing2Stacks {
	public static void main(String[] args) {
		try {
			MyQueue theQueue = new MyQueue();
			for(int i = 1; i <= 5; i++)
				theQueue.enqueue(i);
			System.out.println("Size: " + theQueue.size());
			System.out.println("Peeked item: " + theQueue.peek());
			for(int i = 1; i <= 5; i++)
				System.out.println("Dequeued item: " + theQueue.dequeue());
			theQueue.enqueue(10);
			theQueue.enqueue(20);
			System.out.println("Peeked item: " + theQueue.peek());
			System.out.println("Dequeued item: " + theQueue.dequeue());
			theQueue.enqueue(30);
			System.out.println("Peeked item: " + theQueue.peek());
			System.out.println("Size: " + theQueue.size());
			System.out.println("Dequeued item: " + theQueue.dequeue());
			System.out.println("Dequeued item: " + theQueue.dequeue());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}