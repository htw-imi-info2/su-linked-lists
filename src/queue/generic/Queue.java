package queue.generic;

public class Queue<E> {
	Node<E> first;



	@Override
	public String toString() {
		return first.toString();
	}


	public void enqueue(E data) {
		Node<E> newNode = new Node<>(data, null);
		if (first == null)
			first = newNode;
		else {
			newNode.next = first;
			first = newNode;
		}
	}

	public E dequeue() {
		Node<E> current = first;
		// handle empty
		// handle one element
		while(current.next.next != null)
			current = current.next;
		E result = current.next.data;
		current.next = null;
		return result;
	}
}
