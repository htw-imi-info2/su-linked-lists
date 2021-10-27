package queue.generic;

public class Node<E> {

	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		if (next == null)
			return data.toString();
		else
			return data.toString() + ", " + next.toString();
	}
}
