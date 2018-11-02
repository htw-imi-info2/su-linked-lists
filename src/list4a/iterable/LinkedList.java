package list4a.iterable;

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
		Node<E> beforeBefore = null;
		Node<E> before = null;
		Node<E> current = null;
		Node<E> next;

		public LLIterator(Node<E> first) {
			next = first;
		}

		@Override
		public boolean hasNext() {
			return next != null;
		}

		@Override
		public E next() {
			E data = next.data;
			//move all pointers forward
			beforeBefore = before;
			before = current;
			current = next;
			next = next.next;
			return data;
		}

		@Override
		public void remove() {
			if (before == null) {
				first = next;
			} else {
				before.next = next;
			}
			// move remaining pointers back
			current = before;
			before = beforeBefore;
		}
	}

}
