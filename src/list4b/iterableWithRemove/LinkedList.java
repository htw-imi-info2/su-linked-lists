package list4b.iterableWithRemove;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> implements Iterable<E> {
	Node<E> first;

	public void add(E data) {
		Node<E> newNode = new Node<>(data, null);
		if (first == null)
			first = newNode;
		else {
			if (first.data.compareTo(data) > 0) {
				newNode.next = first;
				first = newNode;
			} else {
				Node<E> current = first;
				while ((current.next != null)
						&& (current.next.data.compareTo(data) < 0))
					current = current.next;

				newNode.next = current.next;
				current.next = newNode;
			}
		}

	}

	@Override
	public String toString() {
		if (first == null)
			return "";
		else
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

	// Method for implementing Iterable
	@Override
	public Iterator<E> iterator() {
		return new LLIterator<E>(first);
	}

	// class LLIterator<T extends Comparable<T>> implements Iterator<T> {
	// Node<T> next;
	class LLIterator<T extends Comparable<E>> implements Iterator<E> {
		Node<E> current = null;


		public LLIterator(Node<E> first) {
			current = first;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			E data = current.data;
			current = current.next;
			return data;
		}

		@Override
		public void remove() {
			
		}
	}

}
