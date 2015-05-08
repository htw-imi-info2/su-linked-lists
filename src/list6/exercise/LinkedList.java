package list6.exercise;

public class LinkedList<E> {
	Node<E> first;
	
	@Override
	public String toString() {
		if (first == null)
			return "";
		else
			return first.toString();
	}

	public void add(E data) {	
		first  = new Node<>(data,first);
	}

	public int size() {
		int counter = 0;
		Node<E> current = first;
		while(current != null) {
			current = current.next;
			counter++;
		}
		return counter;
	}

}
