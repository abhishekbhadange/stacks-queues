package stacksQueues;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;	// acts as a timestamp
	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;
		if(a instanceof Dog)
			dogs.addLast((Dog)a);
		else if(a instanceof Cat)
			cats.addLast((Cat)a);
	}
	public Animal dequeueAny() {
		if(dogs.size() == 0)
			return dequeueCat();
		else if(cats.size() == 0)
			return dequeueDog();
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if(dog.isOlderThan(cat))
			return dequeueDog();
		else
			return dequeueCat();
	}
	public Dog dequeueDog() {
		return dogs.poll();
	}
	public Cat dequeueCat() {
		return cats.poll();
	}
}