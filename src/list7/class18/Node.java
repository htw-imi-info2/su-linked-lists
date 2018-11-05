package list7.class18;

import java.util.Iterator;

/**
 * The simplest list implementation 
 * with an example Iterable implementation
 * using an anonymous class.
 * @author Barne Kleinen
 *
 * @param <E>
 */
public class Node<E> implements Iterable<E>{
	E data;
	Node<E> next;

	Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			Node<E> current = Node.this;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				E element = current.data;
				current = current.next;
				return element;
			}

		};
	}

}
