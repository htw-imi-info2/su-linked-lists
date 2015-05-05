package list3.comparable;

public class LinkedList<E> {
	Node<E> first;

	public void add(E data) {
		Node<E> newNode = new Node<>(data, null);
		if (first == null)
			first = newNode;
		else {
			Node<E> current = first;
			while (current.next != null)
				current = current.next;
			current.next = newNode;
		}

	}

	

	@Override
	public String toString() {
		return first.toString();
	}

	public E get(int index) {
		if (index == 0)
			return first.data;
		int i = 0;
		Node<E> current = first;
		while ((i < index) && (current != null)) {
			current = current.next;
			i++;
		}
		if (current == null)
			return null;
		return current.data;
	}

}
