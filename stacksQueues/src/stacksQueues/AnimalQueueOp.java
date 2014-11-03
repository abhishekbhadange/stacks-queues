package stacksQueues;

public class AnimalQueueOp {
	public static void main(String[] args) {
		AnimalQueue theQueue = new AnimalQueue();
		theQueue.enqueue(new Dog("dog1"));
		theQueue.enqueue(new Cat("cat1"));
		theQueue.enqueue(new Dog("dog2"));
		theQueue.enqueue(new Dog("dog3"));
		theQueue.enqueue(new Cat("cat2"));
		theQueue.enqueue(new Dog("dog4"));
		theQueue.enqueue(new Cat("cat3"));
		Animal node = theQueue.dequeueDog();
		System.out.println("Dog name: " + node.name);
		node = theQueue.dequeueAny();
		System.out.println("Animal name: " + node.name);
		node = theQueue.dequeueCat();
		System.out.println("Cat name: " + node.name);
	}
}